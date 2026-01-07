/**
 */
package catalogue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link catalogue.Catalogue#getComposant <em>Composant</em>}</li>
 * </ul>
 *
 * @see catalogue.CataloguePackage#getCatalogue()
 * @model
 * @generated
 */
public interface Catalogue extends EObject {
	/**
	 * Returns the value of the '<em><b>Composant</b></em>' containment reference list.
	 * The list contents are of type {@link catalogue.Composant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composant</em>' containment reference list.
	 * @see catalogue.CataloguePackage#getCatalogue_Composant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Composant> getComposant();

} // Catalogue
