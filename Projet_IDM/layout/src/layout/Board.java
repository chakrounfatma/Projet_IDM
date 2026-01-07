/**
 */
package layout;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link layout.Board#getLayout <em>Layout</em>}</li>
 *   <li>{@link layout.Board#getCouche_interne <em>Couche interne</em>}</li>
 *   <li>{@link layout.Board#getCouche_externe <em>Couche externe</em>}</li>
 * </ul>
 *
 * @see layout.LayoutPackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends EObject {
	/**
	 * Returns the value of the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' reference.
	 * @see #setLayout(Layout)
	 * @see layout.LayoutPackage#getBoard_Layout()
	 * @model required="true"
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link layout.Board#getLayout <em>Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

	/**
	 * Returns the value of the '<em><b>Couche interne</b></em>' containment reference list.
	 * The list contents are of type {@link layout.Couche_interne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couche interne</em>' containment reference list.
	 * @see layout.LayoutPackage#getBoard_Couche_interne()
	 * @model containment="true"
	 * @generated
	 */
	EList<Couche_interne> getCouche_interne();

	/**
	 * Returns the value of the '<em><b>Couche externe</b></em>' containment reference list.
	 * The list contents are of type {@link layout.Couche_externe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couche externe</em>' containment reference list.
	 * @see layout.LayoutPackage#getBoard_Couche_externe()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<Couche_externe> getCouche_externe();

} // Board
