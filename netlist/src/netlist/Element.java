/**
 */
package netlist;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link netlist.Element#getId <em>Id</em>}</li>
 *   <li>{@link netlist.Element#getNetlist <em>Netlist</em>}</li>
 * </ul>
 *
 * @see netlist.NetlistPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see netlist.NetlistPackage#getElement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link netlist.Element#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Netlist</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link netlist.Netlist#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Netlist</em>' container reference.
	 * @see #setNetlist(Netlist)
	 * @see netlist.NetlistPackage#getElement_Netlist()
	 * @see netlist.Netlist#getElement
	 * @model opposite="element" required="true" transient="false"
	 * @generated
	 */
	Netlist getNetlist();

	/**
	 * Sets the value of the '{@link netlist.Element#getNetlist <em>Netlist</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Netlist</em>' container reference.
	 * @see #getNetlist()
	 * @generated
	 */
	void setNetlist(Netlist value);

} // Element
