/**
 */
package layout;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link layout.Layout#getBoard <em>Board</em>}</li>
 * </ul>
 *
 * @see layout.LayoutPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends EObject {
	/**
	 * Returns the value of the '<em><b>Board</b></em>' containment reference list.
	 * The list contents are of type {@link layout.Board}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' containment reference list.
	 * @see layout.LayoutPackage#getLayout_Board()
	 * @model containment="true"
	 * @generated
	 */
	EList<Board> getBoard();

} // Layout
