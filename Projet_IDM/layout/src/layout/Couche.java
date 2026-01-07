/**
 */
package layout;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Couche</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link layout.Couche#getPiste <em>Piste</em>}</li>
 * </ul>
 *
 * @see layout.LayoutPackage#getCouche()
 * @model abstract="true"
 * @generated
 */
public interface Couche extends EObject {
	/**
	 * Returns the value of the '<em><b>Piste</b></em>' containment reference list.
	 * The list contents are of type {@link layout.Piste}.
	 * It is bidirectional and its opposite is '{@link layout.Piste#getCouche <em>Couche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piste</em>' containment reference list.
	 * @see layout.LayoutPackage#getCouche_Piste()
	 * @see layout.Piste#getCouche
	 * @model opposite="couche" containment="true"
	 * @generated
	 */
	EList<Piste> getPiste();

} // Couche
