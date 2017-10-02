package mydotapicker.controller;

import MatchModel.Contender;

public class HeroSuggestion {
	public final Contender hero;
	public Integer score;
	
	HeroSuggestion(Contender hero, int rank) {
		this.hero = hero;
		this.score = rank;
	}
}
