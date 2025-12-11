/**
 */
package netlist;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link netlist.Port#getConnexion <em>Connexion</em>}</li>
 * </ul>
 *
 * @see netlist.NetlistPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Connexion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connexion</em>' reference.
	 * @see #setConnexion(Connexion)
	 * @see netlist.NetlistPackage#getPort_Connexion()
	 * @model
	 * @generated
	 */
	Connexion getConnexion();

	/**
	 * Sets the value of the '{@link netlist.Port#getConnexion <em>Connexion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connexion</em>' reference.
	 * @see #getConnexion()
	 * @generated
	 */
	void setConnexion(Connexion value);

} // Port
