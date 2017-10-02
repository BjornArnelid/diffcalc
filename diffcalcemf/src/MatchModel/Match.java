/**
 */
package MatchModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MatchModel.Match#getId <em>Id</em>}</li>
 *   <li>{@link MatchModel.Match#getWinner <em>Winner</em>}</li>
 *   <li>{@link MatchModel.Match#getRadiant <em>Radiant</em>}</li>
 *   <li>{@link MatchModel.Match#getDire <em>Dire</em>}</li>
 * </ul>
 *
 * @see MatchModel.MatchModelPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see MatchModel.MatchModelPackage#getMatch_Id()
	 * @model id="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link MatchModel.Match#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Winner</b></em>' attribute.
	 * The default value is <code>"UNKNOWN"</code>.
	 * The literals are from the enumeration {@link MatchModel.Side}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winner</em>' attribute.
	 * @see MatchModel.Side
	 * @see #setWinner(Side)
	 * @see MatchModel.MatchModelPackage#getMatch_Winner()
	 * @model default="UNKNOWN"
	 * @generated
	 */
	Side getWinner();

	/**
	 * Sets the value of the '{@link MatchModel.Match#getWinner <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winner</em>' attribute.
	 * @see MatchModel.Side
	 * @see #getWinner()
	 * @generated
	 */
	void setWinner(Side value);
	
	/**
	 * Returns the value of the '<em><b>Radiant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radiant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radiant</em>' containment reference.
	 * @see #setRadiant(Team)
	 * @see MatchModel.MatchModelPackage#getMatch_Radiant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Team getRadiant();

	/**
	 * Sets the value of the '{@link MatchModel.Match#getRadiant <em>Radiant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radiant</em>' containment reference.
	 * @see #getRadiant()
	 * @generated
	 */
	void setRadiant(Team value);

	/**
	 * Returns the value of the '<em><b>Dire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dire</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dire</em>' containment reference.
	 * @see #setDire(Team)
	 * @see MatchModel.MatchModelPackage#getMatch_Dire()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Team getDire();

	/**
	 * Sets the value of the '{@link MatchModel.Match#getDire <em>Dire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dire</em>' containment reference.
	 * @see #getDire()
	 * @generated
	 */
	void setDire(Team value);

	/**
	 * Merge src into current match
	 * @param src
	 */
	void mergeWith(Match src);

} // Match
