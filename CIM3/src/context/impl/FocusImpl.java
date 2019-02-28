/**
 */
package context.impl;

import context.ContextPackage;
import context.Focus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Focus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link context.impl.FocusImpl#getFocalElement <em>Focal Element</em>}</li>
 *   <li>{@link context.impl.FocusImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link context.impl.FocusImpl#getRole <em>Role</em>}</li>
 *   <li>{@link context.impl.FocusImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link context.impl.FocusImpl#isIsActivated <em>Is Activated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FocusImpl extends MinimalEObjectImpl.Container implements Focus {
	/**
	 * The default value of the '{@link #getFocalElement() <em>Focal Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalElement()
	 * @generated
	 * @ordered
	 */
	protected static final String FOCAL_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFocalElement() <em>Focal Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalElement()
	 * @generated
	 * @ordered
	 */
	protected String focalElement = FOCAL_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgent() <em>Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected String agent = AGENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntity() <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected String entity = ENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsActivated() <em>Is Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActivated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsActivated() <em>Is Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActivated()
	 * @generated
	 * @ordered
	 */
	protected boolean isActivated = IS_ACTIVATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FocusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.FOCUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFocalElement() {
		return focalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocalElement(String newFocalElement) {
		String oldFocalElement = focalElement;
		focalElement = newFocalElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.FOCUS__FOCAL_ELEMENT, oldFocalElement, focalElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgent() {
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgent(String newAgent) {
		String oldAgent = agent;
		agent = newAgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.FOCUS__AGENT, oldAgent, agent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.FOCUS__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(String newEntity) {
		String oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.FOCUS__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsActivated() {
		return isActivated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActivated(boolean newIsActivated) {
		boolean oldIsActivated = isActivated;
		isActivated = newIsActivated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.FOCUS__IS_ACTIVATED, oldIsActivated, isActivated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.FOCUS__FOCAL_ELEMENT:
				return getFocalElement();
			case ContextPackage.FOCUS__AGENT:
				return getAgent();
			case ContextPackage.FOCUS__ROLE:
				return getRole();
			case ContextPackage.FOCUS__ENTITY:
				return getEntity();
			case ContextPackage.FOCUS__IS_ACTIVATED:
				return isIsActivated();
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
			case ContextPackage.FOCUS__FOCAL_ELEMENT:
				setFocalElement((String)newValue);
				return;
			case ContextPackage.FOCUS__AGENT:
				setAgent((String)newValue);
				return;
			case ContextPackage.FOCUS__ROLE:
				setRole((String)newValue);
				return;
			case ContextPackage.FOCUS__ENTITY:
				setEntity((String)newValue);
				return;
			case ContextPackage.FOCUS__IS_ACTIVATED:
				setIsActivated((Boolean)newValue);
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
			case ContextPackage.FOCUS__FOCAL_ELEMENT:
				setFocalElement(FOCAL_ELEMENT_EDEFAULT);
				return;
			case ContextPackage.FOCUS__AGENT:
				setAgent(AGENT_EDEFAULT);
				return;
			case ContextPackage.FOCUS__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case ContextPackage.FOCUS__ENTITY:
				setEntity(ENTITY_EDEFAULT);
				return;
			case ContextPackage.FOCUS__IS_ACTIVATED:
				setIsActivated(IS_ACTIVATED_EDEFAULT);
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
			case ContextPackage.FOCUS__FOCAL_ELEMENT:
				return FOCAL_ELEMENT_EDEFAULT == null ? focalElement != null : !FOCAL_ELEMENT_EDEFAULT.equals(focalElement);
			case ContextPackage.FOCUS__AGENT:
				return AGENT_EDEFAULT == null ? agent != null : !AGENT_EDEFAULT.equals(agent);
			case ContextPackage.FOCUS__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case ContextPackage.FOCUS__ENTITY:
				return ENTITY_EDEFAULT == null ? entity != null : !ENTITY_EDEFAULT.equals(entity);
			case ContextPackage.FOCUS__IS_ACTIVATED:
				return isActivated != IS_ACTIVATED_EDEFAULT;
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
		result.append(" (focalElement: ");
		result.append(focalElement);
		result.append(", agent: ");
		result.append(agent);
		result.append(", role: ");
		result.append(role);
		result.append(", entity: ");
		result.append(entity);
		result.append(", isActivated: ");
		result.append(isActivated);
		result.append(')');
		return result.toString();
	}

} //FocusImpl
