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
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link context.impl.RelationshipImpl#getTocontextelement <em>Tocontextelement</em>}</li>
 *   <li>{@link context.impl.RelationshipImpl#getFromcontextelement <em>Fromcontextelement</em>}</li>
 *   <li>{@link context.impl.RelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link context.impl.RelationshipImpl#getRelfromRefinement <em>Relfrom Refinement</em>}</li>
 *   <li>{@link context.impl.RelationshipImpl#getRelToContext <em>Rel To Context</em>}</li>
 *   <li>{@link context.impl.RelationshipImpl#getRelFromContext <em>Rel From Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends MinimalEObjectImpl.Container implements Relationship {
	/**
	 * The cached value of the '{@link #getTocontextelement() <em>Tocontextelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTocontextelement()
	 * @generated
	 * @ordered
	 */
	protected ContextElement tocontextelement;

	/**
	 * The cached value of the '{@link #getFromcontextelement() <em>Fromcontextelement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromcontextelement()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextElement> fromcontextelement;

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
	 * The cached value of the '{@link #getRelfromRefinement() <em>Relfrom Refinement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelfromRefinement()
	 * @generated
	 * @ordered
	 */
	protected Refinement relfromRefinement;

	/**
	 * The cached value of the '{@link #getRelToContext() <em>Rel To Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelToContext()
	 * @generated
	 * @ordered
	 */
	protected ContextElement relToContext;

	/**
	 * The cached value of the '{@link #getRelFromContext() <em>Rel From Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelFromContext()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextElement> relFromContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextElement getTocontextelement() {
		if (tocontextelement != null && tocontextelement.eIsProxy()) {
			InternalEObject oldTocontextelement = (InternalEObject)tocontextelement;
			tocontextelement = (ContextElement)eResolveProxy(oldTocontextelement);
			if (tocontextelement != oldTocontextelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextPackage.RELATIONSHIP__TOCONTEXTELEMENT, oldTocontextelement, tocontextelement));
			}
		}
		return tocontextelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextElement basicGetTocontextelement() {
		return tocontextelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTocontextelement(ContextElement newTocontextelement, NotificationChain msgs) {
		ContextElement oldTocontextelement = tocontextelement;
		tocontextelement = newTocontextelement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContextPackage.RELATIONSHIP__TOCONTEXTELEMENT, oldTocontextelement, newTocontextelement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTocontextelement(ContextElement newTocontextelement) {
		if (newTocontextelement != tocontextelement) {
			NotificationChain msgs = null;
			if (tocontextelement != null)
				msgs = ((InternalEObject)tocontextelement).eInverseRemove(this, ContextPackage.CONTEXT_ELEMENT__FROMRELATION, ContextElement.class, msgs);
			if (newTocontextelement != null)
				msgs = ((InternalEObject)newTocontextelement).eInverseAdd(this, ContextPackage.CONTEXT_ELEMENT__FROMRELATION, ContextElement.class, msgs);
			msgs = basicSetTocontextelement(newTocontextelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.RELATIONSHIP__TOCONTEXTELEMENT, newTocontextelement, newTocontextelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextElement> getFromcontextelement() {
		if (fromcontextelement == null) {
			fromcontextelement = new EObjectWithInverseResolvingEList.ManyInverse<ContextElement>(ContextElement.class, this, ContextPackage.RELATIONSHIP__FROMCONTEXTELEMENT, ContextPackage.CONTEXT_ELEMENT__TORELATION);
		}
		return fromcontextelement;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.RELATIONSHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refinement getRelfromRefinement() {
		if (relfromRefinement != null && relfromRefinement.eIsProxy()) {
			InternalEObject oldRelfromRefinement = (InternalEObject)relfromRefinement;
			relfromRefinement = (Refinement)eResolveProxy(oldRelfromRefinement);
			if (relfromRefinement != oldRelfromRefinement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextPackage.RELATIONSHIP__RELFROM_REFINEMENT, oldRelfromRefinement, relfromRefinement));
			}
		}
		return relfromRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refinement basicGetRelfromRefinement() {
		return relfromRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelfromRefinement(Refinement newRelfromRefinement) {
		Refinement oldRelfromRefinement = relfromRefinement;
		relfromRefinement = newRelfromRefinement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.RELATIONSHIP__RELFROM_REFINEMENT, oldRelfromRefinement, relfromRefinement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextElement getRelToContext() {
		if (relToContext != null && relToContext.eIsProxy()) {
			InternalEObject oldRelToContext = (InternalEObject)relToContext;
			relToContext = (ContextElement)eResolveProxy(oldRelToContext);
			if (relToContext != oldRelToContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextPackage.RELATIONSHIP__REL_TO_CONTEXT, oldRelToContext, relToContext));
			}
		}
		return relToContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextElement basicGetRelToContext() {
		return relToContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelToContext(ContextElement newRelToContext) {
		ContextElement oldRelToContext = relToContext;
		relToContext = newRelToContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.RELATIONSHIP__REL_TO_CONTEXT, oldRelToContext, relToContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextElement> getRelFromContext() {
		if (relFromContext == null) {
			relFromContext = new EObjectResolvingEList<ContextElement>(ContextElement.class, this, ContextPackage.RELATIONSHIP__REL_FROM_CONTEXT);
		}
		return relFromContext;
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
			case ContextPackage.RELATIONSHIP__TOCONTEXTELEMENT:
				if (tocontextelement != null)
					msgs = ((InternalEObject)tocontextelement).eInverseRemove(this, ContextPackage.CONTEXT_ELEMENT__FROMRELATION, ContextElement.class, msgs);
				return basicSetTocontextelement((ContextElement)otherEnd, msgs);
			case ContextPackage.RELATIONSHIP__FROMCONTEXTELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromcontextelement()).basicAdd(otherEnd, msgs);
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
			case ContextPackage.RELATIONSHIP__TOCONTEXTELEMENT:
				return basicSetTocontextelement(null, msgs);
			case ContextPackage.RELATIONSHIP__FROMCONTEXTELEMENT:
				return ((InternalEList<?>)getFromcontextelement()).basicRemove(otherEnd, msgs);
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
			case ContextPackage.RELATIONSHIP__TOCONTEXTELEMENT:
				if (resolve) return getTocontextelement();
				return basicGetTocontextelement();
			case ContextPackage.RELATIONSHIP__FROMCONTEXTELEMENT:
				return getFromcontextelement();
			case ContextPackage.RELATIONSHIP__NAME:
				return getName();
			case ContextPackage.RELATIONSHIP__RELFROM_REFINEMENT:
				if (resolve) return getRelfromRefinement();
				return basicGetRelfromRefinement();
			case ContextPackage.RELATIONSHIP__REL_TO_CONTEXT:
				if (resolve) return getRelToContext();
				return basicGetRelToContext();
			case ContextPackage.RELATIONSHIP__REL_FROM_CONTEXT:
				return getRelFromContext();
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
			case ContextPackage.RELATIONSHIP__TOCONTEXTELEMENT:
				setTocontextelement((ContextElement)newValue);
				return;
			case ContextPackage.RELATIONSHIP__FROMCONTEXTELEMENT:
				getFromcontextelement().clear();
				getFromcontextelement().addAll((Collection<? extends ContextElement>)newValue);
				return;
			case ContextPackage.RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case ContextPackage.RELATIONSHIP__RELFROM_REFINEMENT:
				setRelfromRefinement((Refinement)newValue);
				return;
			case ContextPackage.RELATIONSHIP__REL_TO_CONTEXT:
				setRelToContext((ContextElement)newValue);
				return;
			case ContextPackage.RELATIONSHIP__REL_FROM_CONTEXT:
				getRelFromContext().clear();
				getRelFromContext().addAll((Collection<? extends ContextElement>)newValue);
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
			case ContextPackage.RELATIONSHIP__TOCONTEXTELEMENT:
				setTocontextelement((ContextElement)null);
				return;
			case ContextPackage.RELATIONSHIP__FROMCONTEXTELEMENT:
				getFromcontextelement().clear();
				return;
			case ContextPackage.RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextPackage.RELATIONSHIP__RELFROM_REFINEMENT:
				setRelfromRefinement((Refinement)null);
				return;
			case ContextPackage.RELATIONSHIP__REL_TO_CONTEXT:
				setRelToContext((ContextElement)null);
				return;
			case ContextPackage.RELATIONSHIP__REL_FROM_CONTEXT:
				getRelFromContext().clear();
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
			case ContextPackage.RELATIONSHIP__TOCONTEXTELEMENT:
				return tocontextelement != null;
			case ContextPackage.RELATIONSHIP__FROMCONTEXTELEMENT:
				return fromcontextelement != null && !fromcontextelement.isEmpty();
			case ContextPackage.RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextPackage.RELATIONSHIP__RELFROM_REFINEMENT:
				return relfromRefinement != null;
			case ContextPackage.RELATIONSHIP__REL_TO_CONTEXT:
				return relToContext != null;
			case ContextPackage.RELATIONSHIP__REL_FROM_CONTEXT:
				return relFromContext != null && !relFromContext.isEmpty();
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

} //RelationshipImpl
