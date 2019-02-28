/**
 */
package context.impl;

import context.ContextElement;
import context.ContextPackage;
import context.Refinement;
import context.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link context.impl.ContextElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link context.impl.ContextElementImpl#getFromrelation <em>Fromrelation</em>}</li>
 *   <li>{@link context.impl.ContextElementImpl#getTorelation <em>Torelation</em>}</li>
 *   <li>{@link context.impl.ContextElementImpl#getRefinement <em>Refinement</em>}</li>
 *   <li>{@link context.impl.ContextElementImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link context.impl.ContextElementImpl#isIsMonitorable <em>Is Monitorable</em>}</li>
 *   <li>{@link context.impl.ContextElementImpl#isIsVerifiable <em>Is Verifiable</em>}</li>
 *   <li>{@link context.impl.ContextElementImpl#isIsFactual <em>Is Factual</em>}</li>
 *   <li>{@link context.impl.ContextElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link context.impl.ContextElementImpl#getFormalSpecification <em>Formal Specification</em>}</li>
 *   <li>{@link context.impl.ContextElementImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link context.impl.ContextElementImpl#getContToRelationship <em>Cont To Relationship</em>}</li>
 *   <li>{@link context.impl.ContextElementImpl#getContFromRelationship <em>Cont From Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextElementImpl extends MinimalEObjectImpl.Container implements ContextElement {
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
	 * The cached value of the '{@link #getFromrelation() <em>Fromrelation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromrelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> fromrelation;

	/**
	 * The cached value of the '{@link #getTorelation() <em>Torelation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTorelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> torelation;

	/**
	 * The cached value of the '{@link #getRefinement() <em>Refinement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinement()
	 * @generated
	 * @ordered
	 */
	protected EList<Refinement> refinement;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMonitorable() <em>Is Monitorable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMonitorable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MONITORABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMonitorable() <em>Is Monitorable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMonitorable()
	 * @generated
	 * @ordered
	 */
	protected boolean isMonitorable = IS_MONITORABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsVerifiable() <em>Is Verifiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVerifiable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VERIFIABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsVerifiable() <em>Is Verifiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVerifiable()
	 * @generated
	 * @ordered
	 */
	protected boolean isVerifiable = IS_VERIFIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFactual() <em>Is Factual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFactual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FACTUAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFactual() <em>Is Factual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFactual()
	 * @generated
	 * @ordered
	 */
	protected boolean isFactual = IS_FACTUAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormalSpecification() <em>Formal Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAL_SPECIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormalSpecification() <em>Formal Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalSpecification()
	 * @generated
	 * @ordered
	 */
	protected String formalSpecification = FORMAL_SPECIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected String property = PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContToRelationship() <em>Cont To Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContToRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> contToRelationship;

	/**
	 * The cached value of the '{@link #getContFromRelationship() <em>Cont From Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContFromRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> contFromRelationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.CONTEXT_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getFromrelation() {
		if (fromrelation == null) {
			fromrelation = new EObjectWithInverseResolvingEList<Relationship>(Relationship.class, this, ContextPackage.CONTEXT_ELEMENT__FROMRELATION, ContextPackage.RELATIONSHIP__TOCONTEXTELEMENT);
		}
		return fromrelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getTorelation() {
		if (torelation == null) {
			torelation = new EObjectWithInverseResolvingEList.ManyInverse<Relationship>(Relationship.class, this, ContextPackage.CONTEXT_ELEMENT__TORELATION, ContextPackage.RELATIONSHIP__FROMCONTEXTELEMENT);
		}
		return torelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Refinement> getRefinement() {
		if (refinement == null) {
			refinement = new EObjectResolvingEList<Refinement>(Refinement.class, this, ContextPackage.CONTEXT_ELEMENT__REFINEMENT);
		}
		return refinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_ELEMENT__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMonitorable() {
		return isMonitorable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMonitorable(boolean newIsMonitorable) {
		boolean oldIsMonitorable = isMonitorable;
		isMonitorable = newIsMonitorable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_ELEMENT__IS_MONITORABLE, oldIsMonitorable, isMonitorable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsVerifiable() {
		return isVerifiable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVerifiable(boolean newIsVerifiable) {
		boolean oldIsVerifiable = isVerifiable;
		isVerifiable = newIsVerifiable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_ELEMENT__IS_VERIFIABLE, oldIsVerifiable, isVerifiable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFactual() {
		return isFactual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFactual(boolean newIsFactual) {
		boolean oldIsFactual = isFactual;
		isFactual = newIsFactual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_ELEMENT__IS_FACTUAL, oldIsFactual, isFactual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_ELEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormalSpecification() {
		return formalSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormalSpecification(String newFormalSpecification) {
		String oldFormalSpecification = formalSpecification;
		formalSpecification = newFormalSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_ELEMENT__FORMAL_SPECIFICATION, oldFormalSpecification, formalSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(String newProperty) {
		String oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_ELEMENT__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getContToRelationship() {
		if (contToRelationship == null) {
			contToRelationship = new EObjectResolvingEList<Relationship>(Relationship.class, this, ContextPackage.CONTEXT_ELEMENT__CONT_TO_RELATIONSHIP);
		}
		return contToRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getContFromRelationship() {
		if (contFromRelationship == null) {
			contFromRelationship = new EObjectResolvingEList<Relationship>(Relationship.class, this, ContextPackage.CONTEXT_ELEMENT__CONT_FROM_RELATIONSHIP);
		}
		return contFromRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextPackage.CONTEXT_ELEMENT__FROMRELATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromrelation()).basicAdd(otherEnd, msgs);
			case ContextPackage.CONTEXT_ELEMENT__TORELATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTorelation()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextPackage.CONTEXT_ELEMENT__FROMRELATION:
				return ((InternalEList<?>)getFromrelation()).basicRemove(otherEnd, msgs);
			case ContextPackage.CONTEXT_ELEMENT__TORELATION:
				return ((InternalEList<?>)getTorelation()).basicRemove(otherEnd, msgs);
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
			case ContextPackage.CONTEXT_ELEMENT__NAME:
				return getName();
			case ContextPackage.CONTEXT_ELEMENT__FROMRELATION:
				return getFromrelation();
			case ContextPackage.CONTEXT_ELEMENT__TORELATION:
				return getTorelation();
			case ContextPackage.CONTEXT_ELEMENT__REFINEMENT:
				return getRefinement();
			case ContextPackage.CONTEXT_ELEMENT__IS_ABSTRACT:
				return isIsAbstract();
			case ContextPackage.CONTEXT_ELEMENT__IS_MONITORABLE:
				return isIsMonitorable();
			case ContextPackage.CONTEXT_ELEMENT__IS_VERIFIABLE:
				return isIsVerifiable();
			case ContextPackage.CONTEXT_ELEMENT__IS_FACTUAL:
				return isIsFactual();
			case ContextPackage.CONTEXT_ELEMENT__DESCRIPTION:
				return getDescription();
			case ContextPackage.CONTEXT_ELEMENT__FORMAL_SPECIFICATION:
				return getFormalSpecification();
			case ContextPackage.CONTEXT_ELEMENT__PROPERTY:
				return getProperty();
			case ContextPackage.CONTEXT_ELEMENT__CONT_TO_RELATIONSHIP:
				return getContToRelationship();
			case ContextPackage.CONTEXT_ELEMENT__CONT_FROM_RELATIONSHIP:
				return getContFromRelationship();
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
			case ContextPackage.CONTEXT_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case ContextPackage.CONTEXT_ELEMENT__FROMRELATION:
				getFromrelation().clear();
				getFromrelation().addAll((Collection<? extends Relationship>)newValue);
				return;
			case ContextPackage.CONTEXT_ELEMENT__TORELATION:
				getTorelation().clear();
				getTorelation().addAll((Collection<? extends Relationship>)newValue);
				return;
			case ContextPackage.CONTEXT_ELEMENT__REFINEMENT:
				getRefinement().clear();
				getRefinement().addAll((Collection<? extends Refinement>)newValue);
				return;
			case ContextPackage.CONTEXT_ELEMENT__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case ContextPackage.CONTEXT_ELEMENT__IS_MONITORABLE:
				setIsMonitorable((Boolean)newValue);
				return;
			case ContextPackage.CONTEXT_ELEMENT__IS_VERIFIABLE:
				setIsVerifiable((Boolean)newValue);
				return;
			case ContextPackage.CONTEXT_ELEMENT__IS_FACTUAL:
				setIsFactual((Boolean)newValue);
				return;
			case ContextPackage.CONTEXT_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ContextPackage.CONTEXT_ELEMENT__FORMAL_SPECIFICATION:
				setFormalSpecification((String)newValue);
				return;
			case ContextPackage.CONTEXT_ELEMENT__PROPERTY:
				setProperty((String)newValue);
				return;
			case ContextPackage.CONTEXT_ELEMENT__CONT_TO_RELATIONSHIP:
				getContToRelationship().clear();
				getContToRelationship().addAll((Collection<? extends Relationship>)newValue);
				return;
			case ContextPackage.CONTEXT_ELEMENT__CONT_FROM_RELATIONSHIP:
				getContFromRelationship().clear();
				getContFromRelationship().addAll((Collection<? extends Relationship>)newValue);
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
			case ContextPackage.CONTEXT_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_ELEMENT__FROMRELATION:
				getFromrelation().clear();
				return;
			case ContextPackage.CONTEXT_ELEMENT__TORELATION:
				getTorelation().clear();
				return;
			case ContextPackage.CONTEXT_ELEMENT__REFINEMENT:
				getRefinement().clear();
				return;
			case ContextPackage.CONTEXT_ELEMENT__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_ELEMENT__IS_MONITORABLE:
				setIsMonitorable(IS_MONITORABLE_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_ELEMENT__IS_VERIFIABLE:
				setIsVerifiable(IS_VERIFIABLE_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_ELEMENT__IS_FACTUAL:
				setIsFactual(IS_FACTUAL_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_ELEMENT__FORMAL_SPECIFICATION:
				setFormalSpecification(FORMAL_SPECIFICATION_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_ELEMENT__PROPERTY:
				setProperty(PROPERTY_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_ELEMENT__CONT_TO_RELATIONSHIP:
				getContToRelationship().clear();
				return;
			case ContextPackage.CONTEXT_ELEMENT__CONT_FROM_RELATIONSHIP:
				getContFromRelationship().clear();
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
			case ContextPackage.CONTEXT_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextPackage.CONTEXT_ELEMENT__FROMRELATION:
				return fromrelation != null && !fromrelation.isEmpty();
			case ContextPackage.CONTEXT_ELEMENT__TORELATION:
				return torelation != null && !torelation.isEmpty();
			case ContextPackage.CONTEXT_ELEMENT__REFINEMENT:
				return refinement != null && !refinement.isEmpty();
			case ContextPackage.CONTEXT_ELEMENT__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case ContextPackage.CONTEXT_ELEMENT__IS_MONITORABLE:
				return isMonitorable != IS_MONITORABLE_EDEFAULT;
			case ContextPackage.CONTEXT_ELEMENT__IS_VERIFIABLE:
				return isVerifiable != IS_VERIFIABLE_EDEFAULT;
			case ContextPackage.CONTEXT_ELEMENT__IS_FACTUAL:
				return isFactual != IS_FACTUAL_EDEFAULT;
			case ContextPackage.CONTEXT_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ContextPackage.CONTEXT_ELEMENT__FORMAL_SPECIFICATION:
				return FORMAL_SPECIFICATION_EDEFAULT == null ? formalSpecification != null : !FORMAL_SPECIFICATION_EDEFAULT.equals(formalSpecification);
			case ContextPackage.CONTEXT_ELEMENT__PROPERTY:
				return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
			case ContextPackage.CONTEXT_ELEMENT__CONT_TO_RELATIONSHIP:
				return contToRelationship != null && !contToRelationship.isEmpty();
			case ContextPackage.CONTEXT_ELEMENT__CONT_FROM_RELATIONSHIP:
				return contFromRelationship != null && !contFromRelationship.isEmpty();
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
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", isMonitorable: ");
		result.append(isMonitorable);
		result.append(", isVerifiable: ");
		result.append(isVerifiable);
		result.append(", isFactual: ");
		result.append(isFactual);
		result.append(", description: ");
		result.append(description);
		result.append(", formalSpecification: ");
		result.append(formalSpecification);
		result.append(", Property: ");
		result.append(property);
		result.append(')');
		return result.toString();
	}

} //ContextElementImpl
