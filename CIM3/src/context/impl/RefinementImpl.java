/**
 */
package context.impl;

import context.ContextElement;
import context.ContextPackage;
import context.Refinement;
import context.RefinementType;
import context.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link context.impl.RefinementImpl#getType <em>Type</em>}</li>
 *   <li>{@link context.impl.RefinementImpl#getRefiningcontexts <em>Refiningcontexts</em>}</li>
 *   <li>{@link context.impl.RefinementImpl#getRefToRelationship <em>Ref To Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefinementImpl extends MinimalEObjectImpl.Container implements Refinement {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RefinementType TYPE_EDEFAULT = RefinementType.AND;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RefinementType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefiningcontexts() <em>Refiningcontexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefiningcontexts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextElement> refiningcontexts;

	/**
	 * The cached value of the '{@link #getRefToRelationship() <em>Ref To Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefToRelationship()
	 * @generated
	 * @ordered
	 */
	protected Relationship refToRelationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefinementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.REFINEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinementType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RefinementType newType) {
		RefinementType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REFINEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextElement> getRefiningcontexts() {
		if (refiningcontexts == null) {
			refiningcontexts = new EObjectResolvingEList<ContextElement>(ContextElement.class, this, ContextPackage.REFINEMENT__REFININGCONTEXTS);
		}
		return refiningcontexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship getRefToRelationship() {
		if (refToRelationship != null && refToRelationship.eIsProxy()) {
			InternalEObject oldRefToRelationship = (InternalEObject)refToRelationship;
			refToRelationship = (Relationship)eResolveProxy(oldRefToRelationship);
			if (refToRelationship != oldRefToRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextPackage.REFINEMENT__REF_TO_RELATIONSHIP, oldRefToRelationship, refToRelationship));
			}
		}
		return refToRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship basicGetRefToRelationship() {
		return refToRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefToRelationship(Relationship newRefToRelationship) {
		Relationship oldRefToRelationship = refToRelationship;
		refToRelationship = newRefToRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REFINEMENT__REF_TO_RELATIONSHIP, oldRefToRelationship, refToRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.REFINEMENT__TYPE:
				return getType();
			case ContextPackage.REFINEMENT__REFININGCONTEXTS:
				return getRefiningcontexts();
			case ContextPackage.REFINEMENT__REF_TO_RELATIONSHIP:
				if (resolve) return getRefToRelationship();
				return basicGetRefToRelationship();
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
			case ContextPackage.REFINEMENT__TYPE:
				setType((RefinementType)newValue);
				return;
			case ContextPackage.REFINEMENT__REFININGCONTEXTS:
				getRefiningcontexts().clear();
				getRefiningcontexts().addAll((Collection<? extends ContextElement>)newValue);
				return;
			case ContextPackage.REFINEMENT__REF_TO_RELATIONSHIP:
				setRefToRelationship((Relationship)newValue);
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
			case ContextPackage.REFINEMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ContextPackage.REFINEMENT__REFININGCONTEXTS:
				getRefiningcontexts().clear();
				return;
			case ContextPackage.REFINEMENT__REF_TO_RELATIONSHIP:
				setRefToRelationship((Relationship)null);
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
			case ContextPackage.REFINEMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case ContextPackage.REFINEMENT__REFININGCONTEXTS:
				return refiningcontexts != null && !refiningcontexts.isEmpty();
			case ContextPackage.REFINEMENT__REF_TO_RELATIONSHIP:
				return refToRelationship != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RefinementImpl
