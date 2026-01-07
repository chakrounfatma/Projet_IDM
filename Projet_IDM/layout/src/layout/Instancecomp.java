/**
 */
package layout;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instancecomp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link layout.Instancecomp#getX <em>X</em>}</li>
 *   <li>{@link layout.Instancecomp#getY <em>Y</em>}</li>
 *   <li>{@link layout.Instancecomp#getComposant <em>Composant</em>}</li>
 *   <li>{@link layout.Instancecomp#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see layout.LayoutPackage#getInstancecomp()
 * @model
 * @generated
 */
public interface Instancecomp extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see layout.LayoutPackage#getInstancecomp_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link layout.Instancecomp#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see layout.LayoutPackage#getInstancecomp_Y()
	 * @model
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link layout.Instancecomp#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Composant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composant</em>' reference.
	 * @see #setComposant(netlist.Instancecomp)
	 * @see layout.LayoutPackage#getInstancecomp_Composant()
	 * @model
	 * @generated
	 */
	netlist.Instancecomp getComposant();

	/**
	 * Sets the value of the '{@link layout.Instancecomp#getComposant <em>Composant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composant</em>' reference.
	 * @see #getComposant()
	 * @generated
	 */
	void setComposant(netlist.Instancecomp value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see layout.LayoutPackage#getInstancecomp_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link layout.Instancecomp#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Instancecomp
