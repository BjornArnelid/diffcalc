package diffcalc.controller;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

import MatchModel.Contender;
import MatchModel.HeroPool;
import MatchModel.Match;
import MatchModel.MatchModelFactory;
import MatchModel.Player;
import MatchModel.PlayerGroup;
import MatchModel.Side;
import diffcalc.Activator;
import diffcalc.view.HeroSuggestionView;

public class MatchUpdateJob extends Job {

	private class MatchSet {
		ArrayList<Match> matches = new ArrayList<>();
	}

	private class PlayerSlot {
		final long playerID;
		final int hero;

		public PlayerSlot(long id, int hero) {
			this.playerID = id;
			this.hero = hero;
		}
	}
	
	private class MatchDeserializer implements JsonDeserializer<MatchSet> {
		public MatchSet deserialize(JsonElement json, Type type, JsonDeserializationContext content) {
			JsonArray array = json.getAsJsonArray();
			MatchSet set = new MatchSet();
			Iterator<JsonElement> iter = array.iterator();
			while (iter.hasNext()) {
				JsonObject matchObj = iter.next().getAsJsonObject();
				set.matches.add(parseMatch(matchObj));
			}
			return set;
		}

		private Match parseMatch(JsonObject matchObj) {
			long matchId = matchObj.getAsJsonPrimitive("match_id").getAsLong();
			Match match = MatchModelFactory.eINSTANCE.createMatch();
			match.setRadiant(MatchModelFactory.eINSTANCE.createTeam());
			match.setDire(MatchModelFactory.eINSTANCE.createTeam());			
			match.setId(matchId);
			
			JsonObject playersObj = matchObj.getAsJsonObject("heroes");
			Set<Entry<String, JsonElement>> slots = playersObj.entrySet();

			for (Entry<String, JsonElement> e : slots) {
				PlayerSlot player = createSlot(e.getValue().getAsJsonObject());
				Contender contender = MatchModelFactory.eINSTANCE.createContender();
				contender.setHero(heroPool.getHero(player.hero));
				int slot = Integer.parseInt(e.getKey());

				Player p = getPlayer(player.playerID);
				if (p != null) {
					contender.setPlayer(p);
				}
				
				if (slot < 5) {
					match.getRadiant().getContenders().add(contender);
				} else {
					match.getDire().getContenders().add(contender);
				}
			}

			Side winner = matchObj.getAsJsonPrimitive("radiant_win").getAsBoolean() ? Side.RADIANT : Side.DIRE;
			match.setWinner(winner);
			return match;
		}

		private Player getPlayer(Long id) {
			for (Player player : group.getPlayers()) {
				if (id.equals(player.getId())) {
					return player;
				}
			}
			return null;
		}

		private PlayerSlot createSlot(JsonObject obj) {
			int hero = obj.getAsJsonPrimitive("hero_id").getAsInt();
			JsonElement idElement = obj.get("account_id");
			Long id = Long.valueOf(-1);
			if (idElement != null && !(idElement instanceof JsonNull)) {
				id = idElement.getAsLong();
			}
			return new PlayerSlot(id, hero);
		}
	}

	private PlayerGroup group;
	private CloseableHttpResponse response;
	private HeroPool heroPool;

	public MatchUpdateJob() {
		super("Updating match data");
	}

	void schedule(PlayerGroup group) {
		if (group == null) {
			return;
		}
		this.group = group;
		schedule();
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		// TODO Be smarter about when and how to run
		Resource heroResource = Activator.getSharedInstance().getHeroPool();
		if (heroResource.getContents() == null || heroResource.getContents().isEmpty()) {
			return Status.CANCEL_STATUS;
		}
		heroPool = (HeroPool)Activator.getSharedInstance().getHeroPool().getContents().get(0);
		GsonBuilder builder = new GsonBuilder();
		builder.registerTypeAdapter(MatchSet.class, new MatchDeserializer());
		Gson gson = builder.create();

		for (Player player : group.getPlayers()) {
			try {
				String data = getHeroData(player.getId());
				MatchSet inputModel = gson.fromJson(data, MatchSet.class);
				if (inputModel == null) {
					return new Status(IStatus.ERROR, HeroSuggestionView.ID, "Unable to fetch Match data");
				} else {
					for (Match src : inputModel.matches) {
						Match dest = player.getMatchFromId(src.getId());
						if (dest != null) {
							dest.mergeWith(src);
						} else {
							synchronized (player.getMatches()) {
								player.getMatches().add(src);
							}
						}
					}
				}
			} catch (IOException e) {
				return new Status(IStatus.ERROR, HeroSuggestionView.ID, "Unable to fetch Match data", e);
			} finally {
				if (response != null) {
					try {
						response.close();
					} catch (IOException e) {
						return new Status(IStatus.ERROR, HeroSuggestionView.ID, "Fetch match data job failed with exception", e);
					}
				}
			}
		}
		// TODO notify adapter if match has been added!
		group.eNotify(null);
		return Status.OK_STATUS;
	}

	
	private String getHeroData(long playerId) throws IOException {
		String returnValue = null;
		CloseableHttpClient client = HttpClients.createDefault();
		try {
			HttpGet httpget = new HttpGet("https://api.opendota.com/api/players/" + playerId + "/matches?project=heroes");
			response = client.execute(httpget);

			HttpEntity matchEntity = response.getEntity();
			if (matchEntity != null) {
				returnValue = EntityUtils.toString(matchEntity);
			}
		} catch(IOException exception) {
			exception.printStackTrace();
		} finally {
			client.close();
		}
		// TODO Null might be a problem here
		return returnValue;
	}
}
