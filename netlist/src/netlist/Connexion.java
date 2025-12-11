/**
 */
package netlist;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connexion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link netlist.Connexion#getPorta <em>Porta</em>}</li>
 *   <li>{@link netlist.Connexion#getPortb <em>Portb</em>}</li>
 * </ul>
 *
 * @see netlist.NetlistPackage#getConnexion()
 * @model
 * @generated
 */
public interface Connexion extends Element {
	/**
	 * Returns the value of the '<em><b>Porta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porta</em>' reference.
	 * @see #setPorta(Port)
	 * @see netlist.NetlistPackage#getConnexion_Porta()
	 * @model
	 * @generated
	 */
	Port getPorta();

	/**
	 * Sets the value of the '{@link netlist.Connexion#getPorta <em>Porta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porta</em>' reference.
	 * @see #getPorta()
	 * @generated
	 */
	void setPorta(Port value);

	/**
	 * Returns the value of the '<em><b>Portb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portb</em>' reference.
	 * @see #setPortb(Port)
	 * @see netlist.NetlistPackage#getConnexion_Portb()
	 * @model
	 * @generated
	 */
	Port getPortb();

	/**
	 * Sets the value of the '{@link netlist.Connexion#getPortb <em>Portb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portb</em>' reference.
	 * @see #getPortb()
	 * @generated
	 */
	void setPortb(Port value);

} // Connexion
