/**
 */
package hu.blackbelt.emfbuildergenerator.company.example.company;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.emfbuildergenerator.company.example.company.Company#getName <em>Name</em>}</li>
 *   <li>{@link hu.blackbelt.emfbuildergenerator.company.example.company.Company#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.emfbuildergenerator.company.example.company.CompanyPackage#getCompany()
 * @model
 * @generated
 */
public interface Company extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.blackbelt.emfbuildergenerator.company.example.company.CompanyPackage#getCompany_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.blackbelt.emfbuildergenerator.company.example.company.Company#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.emfbuildergenerator.company.example.company.Department}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Department</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' containment reference list.
	 * @see hu.blackbelt.emfbuildergenerator.company.example.company.CompanyPackage#getCompany_Department()
	 * @model containment="true"
	 * @generated
	 */
	EList<Department> getDepartment();

} // Company
