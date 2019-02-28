/**
 */
package context.impl;

import context.Atomic;
import context.Composite;
import context.ContextPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link context.impl.CompositeImpl#getAtomicContext <em>Atomic Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeImpl extends ContextElementImpl implements Composite {
	/**
	 * The cached value of the '{@link #getAtomicContext() <em>Atomic Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtomicContext()
	 * @generated
	 * @ordered
	 */
	protected EList<Atomic> atomicContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atomic> getAtomicContext() {
		if (atomicContext == null) {
			atomicContext = new EObjectResolvingEList<Atomic>(Atomic.class, this, ContextPackage.COMPOSITE__ATOMIC_CONTEXT);
		}
		return atomicContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.COMPOSITE__ATOMIC_CONTEXT:
				return getAtomicContext();
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
			case ContextPackage.COMPOSITE__ATOMIC_CONTEXT:
				getAtomicContext().clear();
				getAtomicContext().addAll((Collection<? extends Atomic>)newValue);
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
			case ContextPackage.COMPOSITE__ATOMIC_CONTEXT:
				getAtomicContext().clear();
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
			case ContextPackage.COMPOSITE__ATOMIC_CONTEXT:
				return atomicContext != null && !atomicContext.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeImpl
