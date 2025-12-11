/**
 */
package catalogue;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empreinte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link catalogue.Empreinte#getLongueur <em>Longueur</em>}</li>
 *   <li>{@link catalogue.Empreinte#getLargeur <em>Largeur</em>}</li>
 *   <li>{@link catalogue.Empreinte#getTaillePort <em>Taille Port</em>}</li>
 * </ul>
 *
 * @see catalogue.CataloguePackage#getEmpreinte()
 * @model
 * @generated
 */
public interface Empreinte extends EObject {
	/**
	 * Returns the value of the '<em><b>Longueur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longueur</em>' attribute.
	 * @see #setLongueur(double)
	 * @see catalogue.CataloguePackage#getEmpreinte_Longueur()
	 * @model required="true"
	 * @generated
	 */
	double getLongueur();

	/**
	 * Sets the value of the '{@link catalogue.Empreinte#getLongueur <em>Longueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longueur</em>' attribute.
	 * @see #getLongueur()
	 * @generated
	 */
	void setLongueur(double value);

	/**
	 * Returns the value of the '<em><b>Largeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur</em>' attribute.
	 * @see #setLargeur(double)
	 * @see catalogue.CataloguePackage#getEmpreinte_Largeur()
	 * @model required="true"
	 * @generated
	 */
	double getLargeur();

	/**
	 * Sets the value of the '{@link catalogue.Empreinte#getLargeur <em>Largeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur</em>' attribute.
	 * @see #getLargeur()
	 * @generated
	 */
	void setLargeur(double value);

	/**
	 * Returns the value of the '<em><b>Taille Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taille Port</em>' attribute.
	 * @see #setTaillePort(double)
	 * @see catalogue.CataloguePackage#getEmpreinte_TaillePort()
	 * @model
	 * @generated
	 */
	double getTaillePort();

	/**
	 * Sets the value of the '{@link catalogue.Empreinte#getTaillePort <em>Taille Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taille Port</em>' attribute.
	 * @see #getTaillePort()
	 * @generated
	 */
	void setTaillePort(double value);

} // Empreinte
