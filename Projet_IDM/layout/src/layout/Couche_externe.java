/**
 */
package layout;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Couche externe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link layout.Couche_externe#getInstancecomp <em>Instancecomp</em>}</li>
 * </ul>
 *
 * @see layout.LayoutPackage#getCouche_externe()
 * @model
 * @generated
 */
public interface Couche_externe extends Couche {
	/**
	 * Returns the value of the '<em><b>Instancecomp</b></em>' containment reference list.
	 * The list contents are of type {@link layout.Instancecomp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instancecomp</em>' containment reference list.
	 * @see layout.LayoutPackage#getCouche_externe_Instancecomp()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instancecomp> getInstancecomp();

} // Couche_externe
