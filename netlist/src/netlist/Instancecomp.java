/**
 */
package netlist;

import catalogue.Composant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instancecomp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link netlist.Instancecomp#getComposant <em>Composant</em>}</li>
 *   <li>{@link netlist.Instancecomp#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see netlist.NetlistPackage#getInstancecomp()
 * @model
 * @generated
 */
public interface Instancecomp extends Element {
	/**
	 * Returns the value of the '<em><b>Composant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composant</em>' reference.
	 * @see #setComposant(Composant)
	 * @see netlist.NetlistPackage#getInstancecomp_Composant()
	 * @model
	 * @generated
	 */
	Composant getComposant();

	/**
	 * Sets the value of the '{@link netlist.Instancecomp#getComposant <em>Composant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composant</em>' reference.
	 * @see #getComposant()
	 * @generated
	 */
	void setComposant(Composant value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link netlist.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see netlist.NetlistPackage#getInstancecomp_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPort();

} // Instancecomp
