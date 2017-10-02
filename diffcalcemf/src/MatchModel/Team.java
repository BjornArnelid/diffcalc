/**
 */
package MatchModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MatchModel.Team#getContenders <em>Contenders</em>}</li>
 * </ul>
 *
 * @see MatchModel.MatchModelPackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends EObject {
	/**
	 * Returns the value of the '<em><b>Contenders</b></em>' containment reference list.
	 * The list contents are of type {@link MatchModel.Contender}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenders</em>' containment reference list.
	 * @see MatchModel.MatchModelPackage#getTeam_Contenders()
	 * @model containment="true" lower="5" upper="5"
	 * @generated
	 */
	EList<Contender> getContenders();

	/**
	 * Merge team into current team
	 * @param dire
	 */
	void mergeWith(Team team);

} // Team
