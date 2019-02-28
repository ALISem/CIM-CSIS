/**
 */
package context;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link context.ContextModel#getName <em>Name</em>}</li>
 *   <li>{@link context.ContextModel#getContextelements <em>Contextelements</em>}</li>
 *   <li>{@link context.ContextModel#getRefinements <em>Refinements</em>}</li>
 *   <li>{@link context.ContextModel#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link context.ContextModel#getSources <em>Sources</em>}</li>
 *   <li>{@link context.ContextModel#getAcquisitions <em>Acquisitions</em>}</li>
 *   <li>{@link context.ContextModel#getEntities <em>Entities</em>}</li>
 *   <li>{@link context.ContextModel#getCharacterizations <em>Characterizations</em>}</li>
 *   <li>{@link context.ContextModel#getValidity <em>Validity</em>}</li>
 *   <li>{@link context.ContextModel#getTimeconstraints <em>Timeconstraints</em>}</li>
 *   <li>{@link context.ContextModel#getFoci <em>Foci</em>}</li>
 *   <li>{@link context.ContextModel#getRelevance <em>Relevance</em>}</li>
 * </ul>
 *
 * @see context.ContextPackage#getContextModel()
 * @model
 * @generated
 */
public interface ContextModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see context.ContextPackage#getContextModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link context.ContextModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contextelements</b></em>' containment reference list.
	 * The list contents are of type {@link context.ContextElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contextelements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextelements</em>' containment reference list.
	 * @see context.ContextPackage#getContextModel_Contextelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextElement> getContextelements();

	/**
	 * Returns the value of the '<em><b>Refinements</b></em>' containment reference list.
	 * The list contents are of type {@link context.Refinement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinements</em>' containment reference list.
	 * @see context.ContextPackage#getContextModel_Refinements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Refinement> getRefinements();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link context.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see context.ContextPackage#getContextModel_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link context.ContextSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see context.ContextPackage#getContextModel_Sources()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextSource> getSources();

	/**
	 * Returns the value of the '<em><b>Acquisitions</b></em>' containment reference list.
	 * The list contents are of type {@link context.Acquisition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acquisitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acquisitions</em>' containment reference list.
	 * @see context.ContextPackage#getContextModel_Acquisitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Acquisition> getAcquisitions();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link context.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see context.ContextPackage#getContextModel_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Characterizations</b></em>' containment reference list.
	 * The list contents are of type {@link context.Characterization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characterizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characterizations</em>' containment reference list.
	 * @see context.ContextPackage#getContextModel_Characterizations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Characterization> getCharacterizations();

	/**
	 * Returns the value of the '<em><b>Validity</b></em>' containment reference list.
	 * The list contents are of type {@link context.Validity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity</em>' containment reference list.
	 * @see context.ContextPackage#getContextModel_Validity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Validity> getValidity();

	/**
	 * Returns the value of the '<em><b>Timeconstraints</b></em>' containment reference list.
	 * The list contents are of type {@link context.TimeConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeconstraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeconstraints</em>' containment reference list.
	 * @see context.ContextPackage#getContextModel_Timeconstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeConstraint> getTimeconstraints();

	/**
	 * Returns the value of the '<em><b>Foci</b></em>' containment reference list.
	 * The list contents are of type {@link context.Focus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foci</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foci</em>' containment reference list.
	 * @see context.ContextPackage#getContextModel_Foci()
	 * @model containment="true"
	 * @generated
	 */
	EList<Focus> getFoci();

	/**
	 * Returns the value of the '<em><b>Relevance</b></em>' containment reference list.
	 * The list contents are of type {@link context.Relevance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relevance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relevance</em>' containment reference list.
	 * @see context.ContextPackage#getContextModel_Relevance()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relevance> getRelevance();

} // ContextModel
