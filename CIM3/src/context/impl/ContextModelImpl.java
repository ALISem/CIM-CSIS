/**
 */
package context.impl;

import context.Acquisition;
import context.Characterization;
import context.ContextElement;
import context.ContextModel;
import context.ContextPackage;
import context.ContextSource;
import context.Entity;
import context.Focus;
import context.Refinement;
import context.Relationship;
import context.Relevance;
import context.TimeConstraint;
import context.Validity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link context.impl.ContextModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link context.impl.ContextModelImpl#getContextelements <em>Contextelements</em>}</li>
 *   <li>{@link context.impl.ContextModelImpl#getRefinements <em>Refinements</em>}</li>
 *   <li>{@link context.impl.ContextModelImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link context.impl.ContextModelImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link context.impl.ContextModelImpl#getAcquisitions <em>Acquisitions</em>}</li>
 *   <li>{@link context.impl.ContextModelImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link context.impl.ContextModelImpl#getCharacterizations <em>Characterizations</em>}</li>
 *   <li>{@link context.impl.ContextModelImpl#getValidity <em>Validity</em>}</li>
 *   <li>{@link context.impl.ContextModelImpl#getTimeconstraints <em>Timeconstraints</em>}</li>
 *   <li>{@link context.impl.ContextModelImpl#getFoci <em>Foci</em>}</li>
 *   <li>{@link context.impl.ContextModelImpl#getRelevance <em>Relevance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextModelImpl extends MinimalEObjectImpl.Container implements ContextModel {
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
	 * The cached value of the '{@link #getContextelements() <em>Contextelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextelements()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextElement> contextelements;

	/**
	 * The cached value of the '{@link #getRefinements() <em>Refinements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinements()
	 * @generated
	 * @ordered
	 */
	protected EList<Refinement> refinements;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationships;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextSource> sources;

	/**
	 * The cached value of the '{@link #getAcquisitions() <em>Acquisitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquisitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Acquisition> acquisitions;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getCharacterizations() <em>Characterizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Characterization> characterizations;

	/**
	 * The cached value of the '{@link #getValidity() <em>Validity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidity()
	 * @generated
	 * @ordered
	 */
	protected EList<Validity> validity;

	/**
	 * The cached value of the '{@link #getTimeconstraints() <em>Timeconstraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeconstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeConstraint> timeconstraints;

	/**
	 * The cached value of the '{@link #getFoci() <em>Foci</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoci()
	 * @generated
	 * @ordered
	 */
	protected EList<Focus> foci;

	/**
	 * The cached value of the '{@link #getRelevance() <em>Relevance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevance()
	 * @generated
	 * @ordered
	 */
	protected EList<Relevance> relevance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.CONTEXT_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextElement> getContextelements() {
		if (contextelements == null) {
			contextelements = new EObjectContainmentEList<ContextElement>(ContextElement.class, this, ContextPackage.CONTEXT_MODEL__CONTEXTELEMENTS);
		}
		return contextelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Refinement> getRefinements() {
		if (refinements == null) {
			refinements = new EObjectContainmentEList<Refinement>(Refinement.class, this, ContextPackage.CONTEXT_MODEL__REFINEMENTS);
		}
		return refinements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<Relationship>(Relationship.class, this, ContextPackage.CONTEXT_MODEL__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextSource> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<ContextSource>(ContextSource.class, this, ContextPackage.CONTEXT_MODEL__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Acquisition> getAcquisitions() {
		if (acquisitions == null) {
			acquisitions = new EObjectContainmentEList<Acquisition>(Acquisition.class, this, ContextPackage.CONTEXT_MODEL__ACQUISITIONS);
		}
		return acquisitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, ContextPackage.CONTEXT_MODEL__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Characterization> getCharacterizations() {
		if (characterizations == null) {
			characterizations = new EObjectContainmentEList<Characterization>(Characterization.class, this, ContextPackage.CONTEXT_MODEL__CHARACTERIZATIONS);
		}
		return characterizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Validity> getValidity() {
		if (validity == null) {
			validity = new EObjectContainmentEList<Validity>(Validity.class, this, ContextPackage.CONTEXT_MODEL__VALIDITY);
		}
		return validity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeConstraint> getTimeconstraints() {
		if (timeconstraints == null) {
			timeconstraints = new EObjectContainmentEList<TimeConstraint>(TimeConstraint.class, this, ContextPackage.CONTEXT_MODEL__TIMECONSTRAINTS);
		}
		return timeconstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Focus> getFoci() {
		if (foci == null) {
			foci = new EObjectContainmentEList<Focus>(Focus.class, this, ContextPackage.CONTEXT_MODEL__FOCI);
		}
		return foci;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relevance> getRelevance() {
		if (relevance == null) {
			relevance = new EObjectContainmentEList<Relevance>(Relevance.class, this, ContextPackage.CONTEXT_MODEL__RELEVANCE);
		}
		return relevance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextPackage.CONTEXT_MODEL__CONTEXTELEMENTS:
				return ((InternalEList<?>)getContextelements()).basicRemove(otherEnd, msgs);
			case ContextPackage.CONTEXT_MODEL__REFINEMENTS:
				return ((InternalEList<?>)getRefinements()).basicRemove(otherEnd, msgs);
			case ContextPackage.CONTEXT_MODEL__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
			case ContextPackage.CONTEXT_MODEL__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case ContextPackage.CONTEXT_MODEL__ACQUISITIONS:
				return ((InternalEList<?>)getAcquisitions()).basicRemove(otherEnd, msgs);
			case ContextPackage.CONTEXT_MODEL__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case ContextPackage.CONTEXT_MODEL__CHARACTERIZATIONS:
				return ((InternalEList<?>)getCharacterizations()).basicRemove(otherEnd, msgs);
			case ContextPackage.CONTEXT_MODEL__VALIDITY:
				return ((InternalEList<?>)getValidity()).basicRemove(otherEnd, msgs);
			case ContextPackage.CONTEXT_MODEL__TIMECONSTRAINTS:
				return ((InternalEList<?>)getTimeconstraints()).basicRemove(otherEnd, msgs);
			case ContextPackage.CONTEXT_MODEL__FOCI:
				return ((InternalEList<?>)getFoci()).basicRemove(otherEnd, msgs);
			case ContextPackage.CONTEXT_MODEL__RELEVANCE:
				return ((InternalEList<?>)getRelevance()).basicRemove(otherEnd, msgs);
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
			case ContextPackage.CONTEXT_MODEL__NAME:
				return getName();
			case ContextPackage.CONTEXT_MODEL__CONTEXTELEMENTS:
				return getContextelements();
			case ContextPackage.CONTEXT_MODEL__REFINEMENTS:
				return getRefinements();
			case ContextPackage.CONTEXT_MODEL__RELATIONSHIPS:
				return getRelationships();
			case ContextPackage.CONTEXT_MODEL__SOURCES:
				return getSources();
			case ContextPackage.CONTEXT_MODEL__ACQUISITIONS:
				return getAcquisitions();
			case ContextPackage.CONTEXT_MODEL__ENTITIES:
				return getEntities();
			case ContextPackage.CONTEXT_MODEL__CHARACTERIZATIONS:
				return getCharacterizations();
			case ContextPackage.CONTEXT_MODEL__VALIDITY:
				return getValidity();
			case ContextPackage.CONTEXT_MODEL__TIMECONSTRAINTS:
				return getTimeconstraints();
			case ContextPackage.CONTEXT_MODEL__FOCI:
				return getFoci();
			case ContextPackage.CONTEXT_MODEL__RELEVANCE:
				return getRelevance();
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
			case ContextPackage.CONTEXT_MODEL__NAME:
				setName((String)newValue);
				return;
			case ContextPackage.CONTEXT_MODEL__CONTEXTELEMENTS:
				getContextelements().clear();
				getContextelements().addAll((Collection<? extends ContextElement>)newValue);
				return;
			case ContextPackage.CONTEXT_MODEL__REFINEMENTS:
				getRefinements().clear();
				getRefinements().addAll((Collection<? extends Refinement>)newValue);
				return;
			case ContextPackage.CONTEXT_MODEL__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case ContextPackage.CONTEXT_MODEL__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends ContextSource>)newValue);
				return;
			case ContextPackage.CONTEXT_MODEL__ACQUISITIONS:
				getAcquisitions().clear();
				getAcquisitions().addAll((Collection<? extends Acquisition>)newValue);
				return;
			case ContextPackage.CONTEXT_MODEL__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case ContextPackage.CONTEXT_MODEL__CHARACTERIZATIONS:
				getCharacterizations().clear();
				getCharacterizations().addAll((Collection<? extends Characterization>)newValue);
				return;
			case ContextPackage.CONTEXT_MODEL__VALIDITY:
				getValidity().clear();
				getValidity().addAll((Collection<? extends Validity>)newValue);
				return;
			case ContextPackage.CONTEXT_MODEL__TIMECONSTRAINTS:
				getTimeconstraints().clear();
				getTimeconstraints().addAll((Collection<? extends TimeConstraint>)newValue);
				return;
			case ContextPackage.CONTEXT_MODEL__FOCI:
				getFoci().clear();
				getFoci().addAll((Collection<? extends Focus>)newValue);
				return;
			case ContextPackage.CONTEXT_MODEL__RELEVANCE:
				getRelevance().clear();
				getRelevance().addAll((Collection<? extends Relevance>)newValue);
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
			case ContextPackage.CONTEXT_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_MODEL__CONTEXTELEMENTS:
				getContextelements().clear();
				return;
			case ContextPackage.CONTEXT_MODEL__REFINEMENTS:
				getRefinements().clear();
				return;
			case ContextPackage.CONTEXT_MODEL__RELATIONSHIPS:
				getRelationships().clear();
				return;
			case ContextPackage.CONTEXT_MODEL__SOURCES:
				getSources().clear();
				return;
			case ContextPackage.CONTEXT_MODEL__ACQUISITIONS:
				getAcquisitions().clear();
				return;
			case ContextPackage.CONTEXT_MODEL__ENTITIES:
				getEntities().clear();
				return;
			case ContextPackage.CONTEXT_MODEL__CHARACTERIZATIONS:
				getCharacterizations().clear();
				return;
			case ContextPackage.CONTEXT_MODEL__VALIDITY:
				getValidity().clear();
				return;
			case ContextPackage.CONTEXT_MODEL__TIMECONSTRAINTS:
				getTimeconstraints().clear();
				return;
			case ContextPackage.CONTEXT_MODEL__FOCI:
				getFoci().clear();
				return;
			case ContextPackage.CONTEXT_MODEL__RELEVANCE:
				getRelevance().clear();
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
			case ContextPackage.CONTEXT_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextPackage.CONTEXT_MODEL__CONTEXTELEMENTS:
				return contextelements != null && !contextelements.isEmpty();
			case ContextPackage.CONTEXT_MODEL__REFINEMENTS:
				return refinements != null && !refinements.isEmpty();
			case ContextPackage.CONTEXT_MODEL__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
			case ContextPackage.CONTEXT_MODEL__SOURCES:
				return sources != null && !sources.isEmpty();
			case ContextPackage.CONTEXT_MODEL__ACQUISITIONS:
				return acquisitions != null && !acquisitions.isEmpty();
			case ContextPackage.CONTEXT_MODEL__ENTITIES:
				return entities != null && !entities.isEmpty();
			case ContextPackage.CONTEXT_MODEL__CHARACTERIZATIONS:
				return characterizations != null && !characterizations.isEmpty();
			case ContextPackage.CONTEXT_MODEL__VALIDITY:
				return validity != null && !validity.isEmpty();
			case ContextPackage.CONTEXT_MODEL__TIMECONSTRAINTS:
				return timeconstraints != null && !timeconstraints.isEmpty();
			case ContextPackage.CONTEXT_MODEL__FOCI:
				return foci != null && !foci.isEmpty();
			case ContextPackage.CONTEXT_MODEL__RELEVANCE:
				return relevance != null && !relevance.isEmpty();
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

} //ContextModelImpl
