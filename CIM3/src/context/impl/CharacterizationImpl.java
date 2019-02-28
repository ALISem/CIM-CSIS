/**
 */
package context.impl;

import context.Characterization;
import context.ContextElement;
import context.ContextPackage;
import context.Entity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characterization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link context.impl.CharacterizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link context.impl.CharacterizationImpl#getCharEntity <em>Char Entity</em>}</li>
 *   <li>{@link context.impl.CharacterizationImpl#getCharContext <em>Char Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterizationImpl extends MinimalEObjectImpl.Container implements Characterization {
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
	 * The cached value of the '{@link #getCharEntity() <em>Char Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> charEntity;

	/**
	 * The cached value of the '{@link #getCharContext() <em>Char Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharContext()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextElement> charContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.CHARACTERIZATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CHARACTERIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getCharEntity() {
		if (charEntity == null) {
			charEntity = new EObjectResolvingEList<Entity>(Entity.class, this, ContextPackage.CHARACTERIZATION__CHAR_ENTITY);
		}
		return charEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextElement> getCharContext() {
		if (charContext == null) {
			charContext = new EObjectResolvingEList<ContextElement>(ContextElement.class, this, ContextPackage.CHARACTERIZATION__CHAR_CONTEXT);
		}
		return charContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.CHARACTERIZATION__NAME:
				return getName();
			case ContextPackage.CHARACTERIZATION__CHAR_ENTITY:
				return getCharEntity();
			case ContextPackage.CHARACTERIZATION__CHAR_CONTEXT:
				return getCharContext();
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
			case ContextPackage.CHARACTERIZATION__NAME:
				setName((String)newValue);
				return;
			case ContextPackage.CHARACTERIZATION__CHAR_ENTITY:
				getCharEntity().clear();
				getCharEntity().addAll((Collection<? extends Entity>)newValue);
				return;
			case ContextPackage.CHARACTERIZATION__CHAR_CONTEXT:
				getCharContext().clear();
				getCharContext().addAll((Collection<? extends ContextElement>)newValue);
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
			case ContextPackage.CHARACTERIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextPackage.CHARACTERIZATION__CHAR_ENTITY:
				getCharEntity().clear();
				return;
			case ContextPackage.CHARACTERIZATION__CHAR_CONTEXT:
				getCharContext().clear();
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
			case ContextPackage.CHARACTERIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextPackage.CHARACTERIZATION__CHAR_ENTITY:
				return charEntity != null && !charEntity.isEmpty();
			case ContextPackage.CHARACTERIZATION__CHAR_CONTEXT:
				return charContext != null && !charContext.isEmpty();
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

} //CharacterizationImpl
