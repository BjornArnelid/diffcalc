/**
 */
package MatchModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MatchModel.PlayerGroup#getPlayers <em>Players</em>}</li>
 * </ul>
 *
 * @see MatchModel.MatchModelPackage#getPlayerGroup()
 * @model
 * @generated
 */
public interface PlayerGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Players</b></em>' reference list.
	 * The list contents are of type {@link MatchModel.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' reference list.
	 * @see MatchModel.MatchModelPackage#getPlayerGroup_Players()
	 * @model required="true" upper="5"
	 * @generated
	 */
	EList<Player> getPlayers();

} // PlayerGroup
