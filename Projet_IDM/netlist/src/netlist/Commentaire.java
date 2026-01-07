/**
 */
package netlist;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commentaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link netlist.Commentaire#getInstancecomp <em>Instancecomp</em>}</li>
 *   <li>{@link netlist.Commentaire#getTexte <em>Texte</em>}</li>
 * </ul>
 *
 * @see netlist.NetlistPackage#getCommentaire()
 * @model
 * @generated
 */
public interface Commentaire extends Element {
	/**
	 * Returns the value of the '<em><b>Instancecomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instancecomp</em>' reference.
	 * @see #setInstancecomp(Instancecomp)
	 * @see netlist.NetlistPackage#getCommentaire_Instancecomp()
	 * @model
	 * @generated
	 */
	Instancecomp getInstancecomp();

	/**
	 * Sets the value of the '{@link netlist.Commentaire#getInstancecomp <em>Instancecomp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instancecomp</em>' reference.
	 * @see #getInstancecomp()
	 * @generated
	 */
	void setInstancecomp(Instancecomp value);

	/**
	 * Returns the value of the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texte</em>' attribute.
	 * @see #setTexte(String)
	 * @see netlist.NetlistPackage#getCommentaire_Texte()
	 * @model
	 * @generated
	 */
	String getTexte();

	/**
	 * Sets the value of the '{@link netlist.Commentaire#getTexte <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texte</em>' attribute.
	 * @see #getTexte()
	 * @generated
	 */
	void setTexte(String value);

} // Commentaire
