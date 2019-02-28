/**
 */
package context;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characterization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link context.Characterization#getName <em>Name</em>}</li>
 *   <li>{@link context.Characterization#getCharEntity <em>Char Entity</em>}</li>
 *   <li>{@link context.Characterization#getCharContext <em>Char Context</em>}</li>
 * </ul>
 *
 * @see context.ContextPackage#getCharacterization()
 * @model
 * @generated
 */
public interface Characterization extends EObject {
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
	 * @see context.ContextPackage#getCharacterization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link context.Characterization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Char Entity</b></em>' reference list.
	 * The list contents are of type {@link context.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char Entity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char Entity</em>' reference list.
	 * @see context.ContextPackage#getCharacterization_CharEntity()
	 * @model required="true"
	 * @generated
	 */
	EList<Entity> getCharEntity();

	/**
	 * Returns the value of the '<em><b>Char Context</b></em>' reference list.
	 * The list contents are of type {@link context.ContextElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char Context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char Context</em>' reference list.
	 * @see context.ContextPackage#getCharacterization_CharContext()
	 * @model required="true"
	 * @generated
	 */
	EList<ContextElement> getCharContext();

} // Characterization
