/**
 */
package MatchModel.impl;

import MatchModel.Hero;
import MatchModel.HeroPool;
import MatchModel.MatchModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hero Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MatchModel.impl.HeroPoolImpl#getHeroes <em>Heroes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeroPoolImpl extends MinimalEObjectImpl.Container implements HeroPool {
	/**
	 * The cached value of the '{@link #getHeroes() <em>Heroes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeroes()
	 * @generated
	 * @ordered
	 */
	protected EList<Hero> heroes;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeroPoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatchModelPackage.Literals.HERO_POOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hero> getHeroes() {
		if (heroes == null) {
			heroes = new EObjectContainmentEList<Hero>(Hero.class, this, MatchModelPackage.HERO_POOL__HEROES);
		}
		return heroes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MatchModelPackage.HERO_POOL__HEROES:
				return ((InternalEList<?>)getHeroes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MatchModelPackage.HERO_POOL__HEROES:
				return getHeroes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MatchModelPackage.HERO_POOL__HEROES:
				getHeroes().clear();
				getHeroes().addAll((Collection<? extends Hero>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MatchModelPackage.HERO_POOL__HEROES:
				getHeroes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MatchModelPackage.HERO_POOL__HEROES:
				return heroes != null && !heroes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Hero getHero(int id) {
		for (Hero h : heroes) {
			if (h.getId() == id) {
				return h;
			}
		}
		return null;
	}

} //HeroPoolImpl
