/**
 */
package MatchModel.impl;

import MatchModel.Contender;
import MatchModel.Hero;
import MatchModel.MatchModelPackage;

import MatchModel.Player;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contender</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MatchModel.impl.ContenderImpl#getHero <em>Hero</em>}</li>
 *   <li>{@link MatchModel.impl.ContenderImpl#getPlayer <em>Player</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenderImpl extends MinimalEObjectImpl.Container implements Contender {
	/**
	 * The cached value of the '{@link #getHero() <em>Hero</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHero()
	 * @generated
	 * @ordered
	 */
	protected Hero hero;

	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected Player player;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatchModelPackage.Literals.CONTENDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hero getHero() {
		if (hero != null && hero.eIsProxy()) {
			InternalEObject oldHero = (InternalEObject)hero;
			hero = (Hero)eResolveProxy(oldHero);
			if (hero != oldHero) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatchModelPackage.CONTENDER__HERO, oldHero, hero));
			}
		}
		return hero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hero basicGetHero() {
		return hero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHero(Hero newHero) {
		Hero oldHero = hero;
		hero = newHero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchModelPackage.CONTENDER__HERO, oldHero, hero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getPlayer() {
		if (player != null && player.eIsProxy()) {
			InternalEObject oldPlayer = (InternalEObject)player;
			player = (Player)eResolveProxy(oldPlayer);
			if (player != oldPlayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatchModelPackage.CONTENDER__PLAYER, oldPlayer, player));
			}
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetPlayer() {
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayer(Player newPlayer) {
		Player oldPlayer = player;
		player = newPlayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchModelPackage.CONTENDER__PLAYER, oldPlayer, player));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MatchModelPackage.CONTENDER__HERO:
				if (resolve) return getHero();
				return basicGetHero();
			case MatchModelPackage.CONTENDER__PLAYER:
				if (resolve) return getPlayer();
				return basicGetPlayer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MatchModelPackage.CONTENDER__HERO:
				setHero((Hero)newValue);
				return;
			case MatchModelPackage.CONTENDER__PLAYER:
				setPlayer((Player)newValue);
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
			case MatchModelPackage.CONTENDER__HERO:
				setHero((Hero)null);
				return;
			case MatchModelPackage.CONTENDER__PLAYER:
				setPlayer((Player)null);
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
			case MatchModelPackage.CONTENDER__HERO:
				return hero != null;
			case MatchModelPackage.CONTENDER__PLAYER:
				return player != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getHero() == null) ? 0 : Integer.hashCode(getHero().getId()));
		result = prime * result + ((getPlayer() == null) ? 0 : Long.hashCode(getPlayer().getId()));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContenderImpl other = (ContenderImpl) obj;
		if (getHero() == null) {
			if (other.getHero() != null)
				return false;
		} else if (getHero().getId() != other.getHero().getId())
			return false;
		if (getPlayer() == null) {
			if (other.getPlayer() != null)
				return false;
		} else if (getPlayer().getId() != other.getPlayer().getId())
			return false;
		return true;
	}

	
} //ContenderImpl
