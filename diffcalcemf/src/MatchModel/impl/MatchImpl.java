/**
 */
package MatchModel.impl;

import MatchModel.Match;
import MatchModel.MatchModelPackage;
import MatchModel.Side;
import MatchModel.Team;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MatchModel.impl.MatchImpl#getId <em>Id</em>}</li>
 *   <li>{@link MatchModel.impl.MatchImpl#getWinner <em>Winner</em>}</li>
 *   <li>{@link MatchModel.impl.MatchImpl#getRadiant <em>Radiant</em>}</li>
 *   <li>{@link MatchModel.impl.MatchImpl#getDire <em>Dire</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWinner() <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinner()
	 * @generated
	 * @ordered
	 */
	protected static final Side WINNER_EDEFAULT = Side.UNKNOWN;

	/**
	 * The cached value of the '{@link #getWinner() <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinner()
	 * @generated
	 * @ordered
	 */
	protected Side winner = WINNER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRadiant() <em>Radiant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiant()
	 * @generated
	 * @ordered
	 */
	protected Team radiant;

	/**
	 * The cached value of the '{@link #getDire() <em>Dire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDire()
	 * @generated
	 * @ordered
	 */
	protected Team dire;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatchModelPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchModelPackage.MATCH__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Side getWinner() {
		return winner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWinner(Side newWinner) {
		Side oldWinner = winner;
		winner = newWinner == null ? WINNER_EDEFAULT : newWinner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchModelPackage.MATCH__WINNER, oldWinner, winner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getRadiant() {
		return radiant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRadiant(Team newRadiant, NotificationChain msgs) {
		Team oldRadiant = radiant;
		radiant = newRadiant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MatchModelPackage.MATCH__RADIANT, oldRadiant, newRadiant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MatchModelPackage.MATCH__ID:
				return getId();
			case MatchModelPackage.MATCH__WINNER:
				return getWinner();
			case MatchModelPackage.MATCH__RADIANT:
				return getRadiant();
			case MatchModelPackage.MATCH__DIRE:
				return getDire();
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
			case MatchModelPackage.MATCH__ID:
				setId((Long)newValue);
				return;
			case MatchModelPackage.MATCH__WINNER:
				setWinner((Side)newValue);
				return;
			case MatchModelPackage.MATCH__RADIANT:
				setRadiant((Team)newValue);
				return;
			case MatchModelPackage.MATCH__DIRE:
				setDire((Team)newValue);
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
			case MatchModelPackage.MATCH__ID:
				setId(ID_EDEFAULT);
				return;
			case MatchModelPackage.MATCH__WINNER:
				setWinner(WINNER_EDEFAULT);
				return;
			case MatchModelPackage.MATCH__RADIANT:
				setRadiant((Team)null);
				return;
			case MatchModelPackage.MATCH__DIRE:
				setDire((Team)null);
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
			case MatchModelPackage.MATCH__ID:
				return id != ID_EDEFAULT;
			case MatchModelPackage.MATCH__WINNER:
				return winner != WINNER_EDEFAULT;
			case MatchModelPackage.MATCH__RADIANT:
				return radiant != null;
			case MatchModelPackage.MATCH__DIRE:
				return dire != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", winner: ");
		result.append(winner);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadiant(Team newRadiant) {
		if (newRadiant != radiant) {
			NotificationChain msgs = null;
			if (radiant != null)
				msgs = ((InternalEObject)radiant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MatchModelPackage.MATCH__RADIANT, null, msgs);
			if (newRadiant != null)
				msgs = ((InternalEObject)newRadiant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MatchModelPackage.MATCH__RADIANT, null, msgs);
			msgs = basicSetRadiant(newRadiant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchModelPackage.MATCH__RADIANT, newRadiant, newRadiant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getDire() {
		return dire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDire(Team newDire, NotificationChain msgs) {
		Team oldDire = dire;
		dire = newDire;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MatchModelPackage.MATCH__DIRE, oldDire, newDire);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDire(Team newDire) {
		if (newDire != dire) {
			NotificationChain msgs = null;
			if (dire != null)
				msgs = ((InternalEObject)dire).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MatchModelPackage.MATCH__DIRE, null, msgs);
			if (newDire != null)
				msgs = ((InternalEObject)newDire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MatchModelPackage.MATCH__DIRE, null, msgs);
			msgs = basicSetDire(newDire, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchModelPackage.MATCH__DIRE, newDire, newDire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MatchModelPackage.MATCH__RADIANT:
				return basicSetRadiant(null, msgs);
			case MatchModelPackage.MATCH__DIRE:
				return basicSetDire(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public void mergeWith(Match src) {
		getRadiant().mergeWith(src.getRadiant());
		getDire().mergeWith(src.getDire());
	}

	
} //MatchImpl
