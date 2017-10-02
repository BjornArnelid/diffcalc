/**
 */
package MatchModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hero Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MatchModel.HeroPool#getHeroes <em>Heroes</em>}</li>
 * </ul>
 *
 * @see MatchModel.MatchModelPackage#getHeroPool()
 * @model
 * @generated
 */
public interface HeroPool extends EObject {
	/**
	 * Returns the value of the '<em><b>Heroes</b></em>' containment reference list.
	 * The list contents are of type {@link MatchModel.Hero}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heroes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heroes</em>' containment reference list.
	 * @see MatchModel.MatchModelPackage#getHeroPool_Heroes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hero> getHeroes();

	/**
	 * Get hero from hero id
	 * @param id hero id
	 * @return Hero
	 */
	Hero getHero(int id);
} // HeroPool
