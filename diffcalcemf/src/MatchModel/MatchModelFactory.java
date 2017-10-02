/**
 */
package MatchModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MatchModel.MatchModelPackage
 * @generated
 */
public interface MatchModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MatchModelFactory eINSTANCE = MatchModel.impl.MatchModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Player Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player Group</em>'.
	 * @generated
	 */
	PlayerGroup createPlayerGroup();

	/**
	 * Returns a new object of class '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player</em>'.
	 * @generated
	 */
	Player createPlayer();

	/**
	 * Returns a new object of class '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match</em>'.
	 * @generated
	 */
	Match createMatch();

	/**
	 * Returns a new object of class '<em>Hero</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hero</em>'.
	 * @generated
	 */
	Hero createHero();

	/**
	 * Returns a new object of class '<em>Contender</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contender</em>'.
	 * @generated
	 */
	Contender createContender();

	/**
	 * Returns a new object of class '<em>Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team</em>'.
	 * @generated
	 */
	Team createTeam();

	/**
	 * Returns a new object of class '<em>Hero Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hero Pool</em>'.
	 * @generated
	 */
	HeroPool createHeroPool();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MatchModelPackage getMatchModelPackage();

} //MatchModelFactory
