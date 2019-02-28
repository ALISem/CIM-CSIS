/**
 */
package context;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link context.Relationship#getTocontextelement <em>Tocontextelement</em>}</li>
 *   <li>{@link context.Relationship#getFromcontextelement <em>Fromcontextelement</em>}</li>
 *   <li>{@link context.Relationship#getName <em>Name</em>}</li>
 *   <li>{@link context.Relationship#getRelfromRefinement <em>Relfrom Refinement</em>}</li>
 *   <li>{@link context.Relationship#getRelToContext <em>Rel To Context</em>}</li>
 *   <li>{@link context.Relationship#getRelFromContext <em>Rel From Context</em>}</li>
 * </ul>
 *
 * @see context.ContextPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Tocontextelement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link context.ContextElement#getFromrelation <em>Fromrelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tocontextelement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tocontextelement</em>' reference.
	 * @see #setTocontextelement(ContextElement)
	 * @see context.ContextPackage#getRelationship_Tocontextelement()
	 * @see context.ContextElement#getFromrelation
	 * @model opposite="Fromrelation" required="true"
	 * @generated
	 */
	ContextElement getTocontextelement();

	/**
	 * Sets the value of the '{@link context.Relationship#getTocontextelement <em>Tocontextelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tocontextelement</em>' reference.
	 * @see #getTocontextelement()
	 * @generated
	 */
	void setTocontextelement(ContextElement value);

	/**
	 * Returns the value of the '<em><b>Fromcontextelement</b></em>' reference list.
	 * The list contents are of type {@link context.ContextElement}.
	 * It is bidirectional and its opposite is '{@link context.ContextElement#getTorelation <em>Torelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fromcontextelement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fromcontextelement</em>' reference list.
	 * @see context.ContextPackage#getRelationship_Fromcontextelement()
	 * @see context.ContextElement#getTorelation
	 * @model opposite="Torelation" required="true"
	 * @generated
	 */
	EList<ContextElement> getFromcontextelement();

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
	 * @see context.ContextPackage#getRelationship_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link context.Relationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Relfrom Refinement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relfrom Refinement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relfrom Refinement</em>' reference.
	 * @see #setRelfromRefinement(Refinement)
	 * @see context.ContextPackage#getRelationship_RelfromRefinement()
	 * @model
	 * @generated
	 */
	Refinement getRelfromRefinement();

	/**
	 * Sets the value of the '{@link context.Relationship#getRelfromRefinement <em>Relfrom Refinement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relfrom Refinement</em>' reference.
	 * @see #getRelfromRefinement()
	 * @generated
	 */
	void setRelfromRefinement(Refinement value);

	/**
	 * Returns the value of the '<em><b>Rel To Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel To Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel To Context</em>' reference.
	 * @see #setRelToContext(ContextElement)
	 * @see context.ContextPackage#getRelationship_RelToContext()
	 * @model
	 * @generated
	 */
	ContextElement getRelToContext();

	/**
	 * Sets the value of the '{@link context.Relationship#getRelToContext <em>Rel To Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel To Context</em>' reference.
	 * @see #getRelToContext()
	 * @generated
	 */
	void setRelToContext(ContextElement value);

	/**
	 * Returns the value of the '<em><b>Rel From Context</b></em>' reference list.
	 * The list contents are of type {@link context.ContextElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel From Context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel From Context</em>' reference list.
	 * @see context.ContextPackage#getRelationship_RelFromContext()
	 * @model
	 * @generated
	 */
	EList<ContextElement> getRelFromContext();

} // Relationship
