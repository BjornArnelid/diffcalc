/**
 */
package MatchModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contender</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MatchModel.Contender#getHero <em>Hero</em>}</li>
 *   <li>{@link MatchModel.Contender#getPlayer <em>Player</em>}</li>
 * </ul>
 *
 * @see MatchModel.MatchModelPackage#getContender()
 * @model
 * @generated
 */
public interface Contender extends EObject {
	/**
	 * Returns the value of the '<em><b>Hero</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hero</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hero</em>' reference.
	 * @see #setHero(Hero)
	 * @see MatchModel.MatchModelPackage#getContender_Hero()
	 * @model required="true"
	 * @generated
	 */
	Hero getHero();

	/**
	 * Sets the value of the '{@link MatchModel.Contender#getHero <em>Hero</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hero</em>' reference.
	 * @see #getHero()
	 * @generated
	 */
	void setHero(Hero value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(Player)
	 * @see MatchModel.MatchModelPackage#getContender_Player()
	 * @model
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link MatchModel.Contender#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

} // Contender
