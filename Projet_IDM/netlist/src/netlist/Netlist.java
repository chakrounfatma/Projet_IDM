/**
 */
package netlist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Netlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link netlist.Netlist#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see netlist.NetlistPackage#getNetlist()
 * @model
 * @generated
 */
public interface Netlist extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link netlist.Element}.
	 * It is bidirectional and its opposite is '{@link netlist.Element#getNetlist <em>Netlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see netlist.NetlistPackage#getNetlist_Element()
	 * @see netlist.Element#getNetlist
	 * @model opposite="netlist" containment="true"
	 * @generated
	 */
	EList<Element> getElement();

} // Netlist
