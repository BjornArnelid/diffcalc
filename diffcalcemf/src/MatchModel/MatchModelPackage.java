/**
 */
package MatchModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MatchModel.MatchModelFactory
 * @model kind="package"
 * @generated
 */
public interface MatchModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MatchModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://se.arnelid.bjorn.diffcalc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "se.arnelid.bjorn.diffcalc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MatchModelPackage eINSTANCE = MatchModel.impl.MatchModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link MatchModel.impl.PlayerGroupImpl <em>Player Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MatchModel.impl.PlayerGroupImpl
	 * @see MatchModel.impl.MatchModelPackageImpl#getPlayerGroup()
	 * @generated
	 */
	int PLAYER_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_GROUP__PLAYERS = 0;

	/**
	 * The number of structural features of the '<em>Player Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Player Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MatchModel.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MatchModel.impl.PlayerImpl
	 * @see MatchModel.impl.MatchModelPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ID = 1;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__MATCHES = 2;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MatchModel.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MatchModel.impl.MatchImpl
	 * @see MatchModel.impl.MatchModelPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ID = 0;

	/**
	 * The feature id for the '<em><b>Winner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__WINNER = 1;

	/**
	 * The feature id for the '<em><b>Radiant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__RADIANT = 2;

	/**
	 * The feature id for the '<em><b>Dire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__DIRE = 3;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MatchModel.impl.HeroImpl <em>Hero</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MatchModel.impl.HeroImpl
	 * @see MatchModel.impl.MatchModelPackageImpl#getHero()
	 * @generated
	 */
	int HERO = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERO__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERO__IMAGE_PATH = 2;

	/**
	 * The number of structural features of the '<em>Hero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Hero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MatchModel.impl.ContenderImpl <em>Contender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MatchModel.impl.ContenderImpl
	 * @see MatchModel.impl.MatchModelPackageImpl#getContender()
	 * @generated
	 */
	int CONTENDER = 4;

	/**
	 * The feature id for the '<em><b>Hero</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENDER__HERO = 0;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENDER__PLAYER = 1;

	/**
	 * The number of structural features of the '<em>Contender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MatchModel.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MatchModel.impl.TeamImpl
	 * @see MatchModel.impl.MatchModelPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 5;

	/**
	 * The feature id for the '<em><b>Contenders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__CONTENDERS = 0;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MatchModel.impl.HeroPoolImpl <em>Hero Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MatchModel.impl.HeroPoolImpl
	 * @see MatchModel.impl.MatchModelPackageImpl#getHeroPool()
	 * @generated
	 */
	int HERO_POOL = 6;

	/**
	 * The feature id for the '<em><b>Heroes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERO_POOL__HEROES = 0;

	/**
	 * The number of structural features of the '<em>Hero Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERO_POOL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Hero Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERO_POOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MatchModel.Side <em>Side</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MatchModel.Side
	 * @see MatchModel.impl.MatchModelPackageImpl#getSide()
	 * @generated
	 */
	int SIDE = 7;


	/**
	 * Returns the meta object for class '{@link MatchModel.PlayerGroup <em>Player Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Group</em>'.
	 * @see MatchModel.PlayerGroup
	 * @generated
	 */
	EClass getPlayerGroup();

	/**
	 * Returns the meta object for the reference list '{@link MatchModel.PlayerGroup#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Players</em>'.
	 * @see MatchModel.PlayerGroup#getPlayers()
	 * @see #getPlayerGroup()
	 * @generated
	 */
	EReference getPlayerGroup_Players();

	/**
	 * Returns the meta object for class '{@link MatchModel.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see MatchModel.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link MatchModel.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MatchModel.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link MatchModel.Player#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MatchModel.Player#getId()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link MatchModel.Player#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matches</em>'.
	 * @see MatchModel.Player#getMatches()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Matches();

	/**
	 * Returns the meta object for class '{@link MatchModel.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see MatchModel.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the attribute '{@link MatchModel.Match#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MatchModel.Match#getId()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Id();

	/**
	 * Returns the meta object for the attribute '{@link MatchModel.Match#getWinner <em>Winner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Winner</em>'.
	 * @see MatchModel.Match#getWinner()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Winner();

	/**
	 * Returns the meta object for the containment reference '{@link MatchModel.Match#getRadiant <em>Radiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Radiant</em>'.
	 * @see MatchModel.Match#getRadiant()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Radiant();

	/**
	 * Returns the meta object for the containment reference '{@link MatchModel.Match#getDire <em>Dire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dire</em>'.
	 * @see MatchModel.Match#getDire()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Dire();

	/**
	 * Returns the meta object for class '{@link MatchModel.Hero <em>Hero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hero</em>'.
	 * @see MatchModel.Hero
	 * @generated
	 */
	EClass getHero();

	/**
	 * Returns the meta object for the attribute '{@link MatchModel.Hero#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MatchModel.Hero#getId()
	 * @see #getHero()
	 * @generated
	 */
	EAttribute getHero_Id();

	/**
	 * Returns the meta object for the attribute '{@link MatchModel.Hero#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MatchModel.Hero#getName()
	 * @see #getHero()
	 * @generated
	 */
	EAttribute getHero_Name();

	/**
	 * Returns the meta object for the attribute '{@link MatchModel.Hero#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see MatchModel.Hero#getImagePath()
	 * @see #getHero()
	 * @generated
	 */
	EAttribute getHero_ImagePath();

	/**
	 * Returns the meta object for class '{@link MatchModel.Contender <em>Contender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contender</em>'.
	 * @see MatchModel.Contender
	 * @generated
	 */
	EClass getContender();

	/**
	 * Returns the meta object for the reference '{@link MatchModel.Contender#getHero <em>Hero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hero</em>'.
	 * @see MatchModel.Contender#getHero()
	 * @see #getContender()
	 * @generated
	 */
	EReference getContender_Hero();

	/**
	 * Returns the meta object for the reference '{@link MatchModel.Contender#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see MatchModel.Contender#getPlayer()
	 * @see #getContender()
	 * @generated
	 */
	EReference getContender_Player();

	/**
	 * Returns the meta object for class '{@link MatchModel.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see MatchModel.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the containment reference list '{@link MatchModel.Team#getContenders <em>Contenders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contenders</em>'.
	 * @see MatchModel.Team#getContenders()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Contenders();

	/**
	 * Returns the meta object for class '{@link MatchModel.HeroPool <em>Hero Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hero Pool</em>'.
	 * @see MatchModel.HeroPool
	 * @generated
	 */
	EClass getHeroPool();

	/**
	 * Returns the meta object for the containment reference list '{@link MatchModel.HeroPool#getHeroes <em>Heroes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Heroes</em>'.
	 * @see MatchModel.HeroPool#getHeroes()
	 * @see #getHeroPool()
	 * @generated
	 */
	EReference getHeroPool_Heroes();

	/**
	 * Returns the meta object for enum '{@link MatchModel.Side <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Side</em>'.
	 * @see MatchModel.Side
	 * @generated
	 */
	EEnum getSide();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MatchModelFactory getMatchModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MatchModel.impl.PlayerGroupImpl <em>Player Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MatchModel.impl.PlayerGroupImpl
		 * @see MatchModel.impl.MatchModelPackageImpl#getPlayerGroup()
		 * @generated
		 */
		EClass PLAYER_GROUP = eINSTANCE.getPlayerGroup();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_GROUP__PLAYERS = eINSTANCE.getPlayerGroup_Players();

		/**
		 * The meta object literal for the '{@link MatchModel.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MatchModel.impl.PlayerImpl
		 * @see MatchModel.impl.MatchModelPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__ID = eINSTANCE.getPlayer_Id();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__MATCHES = eINSTANCE.getPlayer_Matches();

		/**
		 * The meta object literal for the '{@link MatchModel.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MatchModel.impl.MatchImpl
		 * @see MatchModel.impl.MatchModelPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__ID = eINSTANCE.getMatch_Id();

		/**
		 * The meta object literal for the '<em><b>Winner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__WINNER = eINSTANCE.getMatch_Winner();

		/**
		 * The meta object literal for the '<em><b>Radiant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__RADIANT = eINSTANCE.getMatch_Radiant();

		/**
		 * The meta object literal for the '<em><b>Dire</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__DIRE = eINSTANCE.getMatch_Dire();

		/**
		 * The meta object literal for the '{@link MatchModel.impl.HeroImpl <em>Hero</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MatchModel.impl.HeroImpl
		 * @see MatchModel.impl.MatchModelPackageImpl#getHero()
		 * @generated
		 */
		EClass HERO = eINSTANCE.getHero();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HERO__ID = eINSTANCE.getHero_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HERO__NAME = eINSTANCE.getHero_Name();

		/**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HERO__IMAGE_PATH = eINSTANCE.getHero_ImagePath();

		/**
		 * The meta object literal for the '{@link MatchModel.impl.ContenderImpl <em>Contender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MatchModel.impl.ContenderImpl
		 * @see MatchModel.impl.MatchModelPackageImpl#getContender()
		 * @generated
		 */
		EClass CONTENDER = eINSTANCE.getContender();

		/**
		 * The meta object literal for the '<em><b>Hero</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENDER__HERO = eINSTANCE.getContender_Hero();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENDER__PLAYER = eINSTANCE.getContender_Player();

		/**
		 * The meta object literal for the '{@link MatchModel.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MatchModel.impl.TeamImpl
		 * @see MatchModel.impl.MatchModelPackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Contenders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__CONTENDERS = eINSTANCE.getTeam_Contenders();

		/**
		 * The meta object literal for the '{@link MatchModel.impl.HeroPoolImpl <em>Hero Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MatchModel.impl.HeroPoolImpl
		 * @see MatchModel.impl.MatchModelPackageImpl#getHeroPool()
		 * @generated
		 */
		EClass HERO_POOL = eINSTANCE.getHeroPool();

		/**
		 * The meta object literal for the '<em><b>Heroes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HERO_POOL__HEROES = eINSTANCE.getHeroPool_Heroes();

		/**
		 * The meta object literal for the '{@link MatchModel.Side <em>Side</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MatchModel.Side
		 * @see MatchModel.impl.MatchModelPackageImpl#getSide()
		 * @generated
		 */
		EEnum SIDE = eINSTANCE.getSide();

	}

} //MatchModelPackage
