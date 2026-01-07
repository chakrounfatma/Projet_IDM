/**
 */
package layout;

import netlist.Connexion;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Piste</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link layout.Piste#getCouche <em>Couche</em>}</li>
 *   <li>{@link layout.Piste#getConnexion <em>Connexion</em>}</li>
 * </ul>
 *
 * @see layout.LayoutPackage#getPiste()
 * @model
 * @generated
 */
public interface Piste extends EObject {
	/**
	 * Returns the value of the '<em><b>Couche</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link layout.Couche#getPiste <em>Piste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couche</em>' container reference.
	 * @see #setCouche(Couche)
	 * @see layout.LayoutPackage#getPiste_Couche()
	 * @see layout.Couche#getPiste
	 * @model opposite="piste" required="true" transient="false"
	 * @generated
	 */
	Couche getCouche();

	/**
	 * Sets the value of the '{@link layout.Piste#getCouche <em>Couche</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couche</em>' container reference.
	 * @see #getCouche()
	 * @generated
	 */
	void setCouche(Couche value);

	/**
	 * Returns the value of the '<em><b>Connexion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connexion</em>' reference.
	 * @see #setConnexion(Connexion)
	 * @see layout.LayoutPackage#getPiste_Connexion()
	 * @model
	 * @generated
	 */
	Connexion getConnexion();

	/**
	 * Sets the value of the '{@link layout.Piste#getConnexion <em>Connexion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connexion</em>' reference.
	 * @see #getConnexion()
	 * @generated
	 */
	void setConnexion(Connexion value);

} // Piste
