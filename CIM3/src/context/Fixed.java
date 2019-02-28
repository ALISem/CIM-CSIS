/**
 */
package context;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link context.Fixed#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link context.Fixed#getEndTime <em>End Time</em>}</li>
 * </ul>
 *
 * @see context.ContextPackage#getFixed()
 * @model
 * @generated
 */
public interface Fixed extends TimeConstraint {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * The literals are from the enumeration {@link context.Date}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see context.Date
	 * @see #setStartTime(Date)
	 * @see context.ContextPackage#getFixed_StartTime()
	 * @model
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link context.Fixed#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see context.Date
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * The literals are from the enumeration {@link context.Date}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see context.Date
	 * @see #setEndTime(Date)
	 * @see context.ContextPackage#getFixed_EndTime()
	 * @model
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link context.Fixed#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see context.Date
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

} // Fixed
