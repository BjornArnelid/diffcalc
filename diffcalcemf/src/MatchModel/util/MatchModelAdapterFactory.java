/**
 */
package MatchModel.util;

import MatchModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MatchModel.MatchModelPackage
 * @generated
 */
public class MatchModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MatchModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MatchModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchModelSwitch<Adapter> modelSwitch =
		new MatchModelSwitch<Adapter>() {
			@Override
			public Adapter casePlayerGroup(PlayerGroup object) {
				return createPlayerGroupAdapter();
			}
			@Override
			public Adapter casePlayer(Player object) {
				return createPlayerAdapter();
			}
			@Override
			public Adapter caseMatch(Match object) {
				return createMatchAdapter();
			}
			@Override
			public Adapter caseHero(Hero object) {
				return createHeroAdapter();
			}
			@Override
			public Adapter caseContender(Contender object) {
				return createContenderAdapter();
			}
			@Override
			public Adapter caseTeam(Team object) {
				return createTeamAdapter();
			}
			@Override
			public Adapter caseHeroPool(HeroPool object) {
				return createHeroPoolAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link MatchModel.PlayerGroup <em>Player Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MatchModel.PlayerGroup
	 * @generated
	 */
	public Adapter createPlayerGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MatchModel.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MatchModel.Player
	 * @generated
	 */
	public Adapter createPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MatchModel.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MatchModel.Match
	 * @generated
	 */
	public Adapter createMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MatchModel.Hero <em>Hero</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MatchModel.Hero
	 * @generated
	 */
	public Adapter createHeroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MatchModel.Contender <em>Contender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MatchModel.Contender
	 * @generated
	 */
	public Adapter createContenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MatchModel.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MatchModel.Team
	 * @generated
	 */
	public Adapter createTeamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MatchModel.HeroPool <em>Hero Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MatchModel.HeroPool
	 * @generated
	 */
	public Adapter createHeroPoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MatchModelAdapterFactory
