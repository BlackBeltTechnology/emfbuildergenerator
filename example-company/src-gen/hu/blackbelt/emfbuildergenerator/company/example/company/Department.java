/**
 */
package hu.blackbelt.emfbuildergenerator.company.example.company;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.emfbuildergenerator.company.example.company.Department#getNumber <em>Number</em>}</li>
 *   <li>{@link hu.blackbelt.emfbuildergenerator.company.example.company.Department#getEmployees <em>Employees</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.emfbuildergenerator.company.example.company.CompanyPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see hu.blackbelt.emfbuildergenerator.company.example.company.CompanyPackage#getDepartment_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link hu.blackbelt.emfbuildergenerator.company.example.company.Department#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.emfbuildergenerator.company.example.company.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see hu.blackbelt.emfbuildergenerator.company.example.company.CompanyPackage#getDepartment_Employees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employee> getEmployees();

} // Department
