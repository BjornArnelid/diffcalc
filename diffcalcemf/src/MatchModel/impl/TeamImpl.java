/**
 */
package MatchModel.impl;

import MatchModel.Contender;
import MatchModel.MatchModelPackage;
import MatchModel.Team;

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
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MatchModel.impl.TeamImpl#getContenders <em>Contenders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamImpl extends MinimalEObjectImpl.Container implements Team {
	/**
	 * The cached value of the '{@link #getContenders() <em>Contenders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenders()
	 * @generated
	 * @ordered
	 */
	protected EList<Contender> contenders;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatchModelPackage.Literals.TEAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contender> getContenders() {
		if (contenders == null) {
			contenders = new EObjectContainmentEList<Contender>(Contender.class, this, MatchModelPackage.TEAM__CONTENDERS);
		}
		return contenders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MatchModelPackage.TEAM__CONTENDERS:
				return ((InternalEList<?>)getContenders()).basicRemove(otherEnd, msgs);
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
			case MatchModelPackage.TEAM__CONTENDERS:
				return getContenders();
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
			case MatchModelPackage.TEAM__CONTENDERS:
				getContenders().clear();
				getContenders().addAll((Collection<? extends Contender>)newValue);
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
			case MatchModelPackage.TEAM__CONTENDERS:
				getContenders().clear();
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
			case MatchModelPackage.TEAM__CONTENDERS:
				return contenders != null && !contenders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void mergeWith(Team team) {
		for (Contender other : team.getContenders()) {
			if (other.getPlayer() != null) {
				for (Contender self : getContenders()) {
					if (other.getHero().equals(self.getHero())) {
						synchronized (self) {
							self.setPlayer(other.getPlayer());
						}
						break;
					}
				}
			}
		}
	}

} //TeamImpl
