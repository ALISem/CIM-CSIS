/**
 */
package context.impl;

import context.ContextElement;
import context.ContextPackage;
import context.TimeConstraint;
import context.Validity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link context.impl.ValidityImpl#getName <em>Name</em>}</li>
 *   <li>{@link context.impl.ValidityImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link context.impl.ValidityImpl#getValidContext <em>Valid Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidityImpl extends MinimalEObjectImpl.Container implements Validity {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeConstraint> constraint;

	/**
	 * The cached value of the '{@link #getValidContext() <em>Valid Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidContext()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextElement> validContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.VALIDITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.VALIDITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeConstraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectResolvingEList<TimeConstraint>(TimeConstraint.class, this, ContextPackage.VALIDITY__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextElement> getValidContext() {
		if (validContext == null) {
			validContext = new EObjectResolvingEList<ContextElement>(ContextElement.class, this, ContextPackage.VALIDITY__VALID_CONTEXT);
		}
		return validContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.VALIDITY__NAME:
				return getName();
			case ContextPackage.VALIDITY__CONSTRAINT:
				return getConstraint();
			case ContextPackage.VALIDITY__VALID_CONTEXT:
				return getValidContext();
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
			case ContextPackage.VALIDITY__NAME:
				setName((String)newValue);
				return;
			case ContextPackage.VALIDITY__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends TimeConstraint>)newValue);
				return;
			case ContextPackage.VALIDITY__VALID_CONTEXT:
				getValidContext().clear();
				getValidContext().addAll((Collection<? extends ContextElement>)newValue);
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
			case ContextPackage.VALIDITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextPackage.VALIDITY__CONSTRAINT:
				getConstraint().clear();
				return;
			case ContextPackage.VALIDITY__VALID_CONTEXT:
				getValidContext().clear();
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
			case ContextPackage.VALIDITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextPackage.VALIDITY__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case ContextPackage.VALIDITY__VALID_CONTEXT:
				return validContext != null && !validContext.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ValidityImpl
