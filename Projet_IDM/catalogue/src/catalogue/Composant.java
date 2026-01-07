/**
 */
package catalogue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link catalogue.Composant#getEmpreinte <em>Empreinte</em>}</li>
 *   <li>{@link catalogue.Composant#getContrainte <em>Contrainte</em>}</li>
 *   <li>{@link catalogue.Composant#getNom <em>Nom</em>}</li>
 *   <li>{@link catalogue.Composant#getMarque <em>Marque</em>}</li>
 *   <li>{@link catalogue.Composant#getPort <em>Port</em>}</li>
 *   <li>{@link catalogue.Composant#getCatalogue <em>Catalogue</em>}</li>
 * </ul>
 *
 * @see catalogue.CataloguePackage#getComposant()
 * @model
 * @generated
 */
public interface Composant extends EObject {
	/**
	 * Returns the value of the '<em><b>Empreinte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empreinte</em>' containment reference.
	 * @see #setEmpreinte(Empreinte)
	 * @see catalogue.CataloguePackage#getComposant_Empreinte()
	 * @model containment="true"
	 * @generated
	 */
	Empreinte getEmpreinte();

	/**
	 * Sets the value of the '{@link catalogue.Composant#getEmpreinte <em>Empreinte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empreinte</em>' containment reference.
	 * @see #getEmpreinte()
	 * @generated
	 */
	void setEmpreinte(Empreinte value);

	/**
	 * Returns the value of the '<em><b>Contrainte</b></em>' containment reference list.
	 * The list contents are of type {@link catalogue.Contrainte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrainte</em>' containment reference list.
	 * @see catalogue.CataloguePackage#getComposant_Contrainte()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contrainte> getContrainte();

	/**
	 * Returns the value of the '<em><b>Marque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marque</em>' attribute.
	 * @see #setMarque(String)
	 * @see catalogue.CataloguePackage#getComposant_Marque()
	 * @model
	 * @generated
	 */
	String getMarque();

	/**
	 * Sets the value of the '{@link catalogue.Composant#getMarque <em>Marque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marque</em>' attribute.
	 * @see #getMarque()
	 * @generated
	 */
	void setMarque(String value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see catalogue.CataloguePackage#getComposant_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link catalogue.Composant#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see catalogue.CataloguePackage#getComposant_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link catalogue.Composant#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Catalogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalogue</em>' reference.
	 * @see #setCatalogue(Catalogue)
	 * @see catalogue.CataloguePackage#getComposant_Catalogue()
	 * @model
	 * @generated
	 */
	Catalogue getCatalogue();

	/**
	 * Sets the value of the '{@link catalogue.Composant#getCatalogue <em>Catalogue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalogue</em>' reference.
	 * @see #getCatalogue()
	 * @generated
	 */
	void setCatalogue(Catalogue value);

} // Composant
