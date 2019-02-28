/**
 */
package context;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relevance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link context.Relevance#getLevel <em>Level</em>}</li>
 *   <li>{@link context.Relevance#getArgument <em>Argument</em>}</li>
 *   <li>{@link context.Relevance#getFocus <em>Focus</em>}</li>
 *   <li>{@link context.Relevance#getRelevantContext <em>Relevant Context</em>}</li>
 * </ul>
 *
 * @see context.ContextPackage#getRelevance()
 * @model
 * @generated
 */
public interface Relevance extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link context.RelevanceLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see context.RelevanceLevel
	 * @see #setLevel(RelevanceLevel)
	 * @see context.ContextPackage#getRelevance_Level()
	 * @model
	 * @generated
	 */
	RelevanceLevel getLevel();

	/**
	 * Sets the value of the '{@link context.Relevance#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see context.RelevanceLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(RelevanceLevel value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' attribute.
	 * @see #setArgument(String)
	 * @see context.ContextPackage#getRelevance_Argument()
	 * @model
	 * @generated
	 */
	String getArgument();

	/**
	 * Sets the value of the '{@link context.Relevance#getArgument <em>Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' attribute.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(String value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' reference list.
	 * The list contents are of type {@link context.Focus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focus</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focus</em>' reference list.
	 * @see context.ContextPackage#getRelevance_Focus()
	 * @model
	 * @generated
	 */
	EList<Focus> getFocus();

	/**
	 * Returns the value of the '<em><b>Relevant Context</b></em>' reference list.
	 * The list contents are of type {@link context.ContextElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relevant Context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relevant Context</em>' reference list.
	 * @see context.ContextPackage#getRelevance_RelevantContext()
	 * @model
	 * @generated
	 */
	EList<ContextElement> getRelevantContext();

} // Relevance
