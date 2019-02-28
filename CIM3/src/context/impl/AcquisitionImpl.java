/**
 */
package context.impl;

import context.Acquisition;
import context.ContextElement;
import context.ContextPackage;
import context.ContextSource;
import context.UpdateType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acquisition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link context.impl.AcquisitionImpl#getAquiredcontext <em>Aquiredcontext</em>}</li>
 *   <li>{@link context.impl.AcquisitionImpl#getContextsource <em>Contextsource</em>}</li>
 *   <li>{@link context.impl.AcquisitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link context.impl.AcquisitionImpl#getUpdateFrequency <em>Update Frequency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcquisitionImpl extends MinimalEObjectImpl.Container implements Acquisition {
	/**
	 * The cached value of the '{@link #getAquiredcontext() <em>Aquiredcontext</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAquiredcontext()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextElement> aquiredcontext;

	/**
	 * The cached value of the '{@link #getContextsource() <em>Contextsource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextsource()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextSource> contextsource;

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
	 * The default value of the '{@link #getUpdateFrequency() <em>Update Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final UpdateType UPDATE_FREQUENCY_EDEFAULT = UpdateType.NEVER;

	/**
	 * The cached value of the '{@link #getUpdateFrequency() <em>Update Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateFrequency()
	 * @generated
	 * @ordered
	 */
	protected UpdateType updateFrequency = UPDATE_FREQUENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcquisitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.ACQUISITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextElement> getAquiredcontext() {
		if (aquiredcontext == null) {
			aquiredcontext = new EObjectResolvingEList<ContextElement>(ContextElement.class, this, ContextPackage.ACQUISITION__AQUIREDCONTEXT);
		}
		return aquiredcontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextSource> getContextsource() {
		if (contextsource == null) {
			contextsource = new EObjectResolvingEList<ContextSource>(ContextSource.class, this, ContextPackage.ACQUISITION__CONTEXTSOURCE);
		}
		return contextsource;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.ACQUISITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateType getUpdateFrequency() {
		return updateFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateFrequency(UpdateType newUpdateFrequency) {
		UpdateType oldUpdateFrequency = updateFrequency;
		updateFrequency = newUpdateFrequency == null ? UPDATE_FREQUENCY_EDEFAULT : newUpdateFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.ACQUISITION__UPDATE_FREQUENCY, oldUpdateFrequency, updateFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.ACQUISITION__AQUIREDCONTEXT:
				return getAquiredcontext();
			case ContextPackage.ACQUISITION__CONTEXTSOURCE:
				return getContextsource();
			case ContextPackage.ACQUISITION__NAME:
				return getName();
			case ContextPackage.ACQUISITION__UPDATE_FREQUENCY:
				return getUpdateFrequency();
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
			case ContextPackage.ACQUISITION__AQUIREDCONTEXT:
				getAquiredcontext().clear();
				getAquiredcontext().addAll((Collection<? extends ContextElement>)newValue);
				return;
			case ContextPackage.ACQUISITION__CONTEXTSOURCE:
				getContextsource().clear();
				getContextsource().addAll((Collection<? extends ContextSource>)newValue);
				return;
			case ContextPackage.ACQUISITION__NAME:
				setName((String)newValue);
				return;
			case ContextPackage.ACQUISITION__UPDATE_FREQUENCY:
				setUpdateFrequency((UpdateType)newValue);
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
			case ContextPackage.ACQUISITION__AQUIREDCONTEXT:
				getAquiredcontext().clear();
				return;
			case ContextPackage.ACQUISITION__CONTEXTSOURCE:
				getContextsource().clear();
				return;
			case ContextPackage.ACQUISITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextPackage.ACQUISITION__UPDATE_FREQUENCY:
				setUpdateFrequency(UPDATE_FREQUENCY_EDEFAULT);
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
			case ContextPackage.ACQUISITION__AQUIREDCONTEXT:
				return aquiredcontext != null && !aquiredcontext.isEmpty();
			case ContextPackage.ACQUISITION__CONTEXTSOURCE:
				return contextsource != null && !contextsource.isEmpty();
			case ContextPackage.ACQUISITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextPackage.ACQUISITION__UPDATE_FREQUENCY:
				return updateFrequency != UPDATE_FREQUENCY_EDEFAULT;
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
		result.append(", updateFrequency: ");
		result.append(updateFrequency);
		result.append(')');
		return result.toString();
	}

} //AcquisitionImpl
