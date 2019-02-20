package hu.blackbelt.emfbuildergenerator.company.example.company.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>hu.blackbelt.emfbuildergenerator.company.example.company.Department</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class DepartmentBuilder implements hu.blackbelt.emfbuildergenerator.company.example.company.util.builder.ICompanyBuilder<hu.blackbelt.emfbuildergenerator.company.example.company.Department> {
  // features and builders
  private Integer m_number;
  private java.util.Collection<hu.blackbelt.emfbuildergenerator.company.example.company.Employee> m_employees = new java.util.LinkedList<hu.blackbelt.emfbuildergenerator.company.example.company.Employee>();
  private java.util.Collection<hu.blackbelt.emfbuildergenerator.company.example.company.util.builder.ICompanyBuilder<? extends hu.blackbelt.emfbuildergenerator.company.example.company.Employee>> m_featureEmployeesBuilder = new java.util.LinkedList<hu.blackbelt.emfbuildergenerator.company.example.company.util.builder.ICompanyBuilder<? extends hu.blackbelt.emfbuildergenerator.company.example.company.Employee>>();
  // helper attributes
  private boolean m_featureEmployeesSet = false;
  private boolean m_featureNumberSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newDepartmentBuilder()
   */
  private DepartmentBuilder() {
  }

  /**
   * This method creates a new instance of the DepartmentBuilder.
   * @return new instance of the DepartmentBuilder
   */
  public static DepartmentBuilder create() {
    return new DepartmentBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public DepartmentBuilder but() {
    DepartmentBuilder _builder = create();
    _builder.m_featureEmployeesSet = m_featureEmployeesSet;
    _builder.m_employees = m_employees;
    _builder.m_featureEmployeesBuilder = m_featureEmployeesBuilder;
    _builder.m_featureNumberSet = m_featureNumberSet;
    _builder.m_number = m_number;
    return _builder;
  }

  /**
   * This method constructs the final hu.blackbelt.emfbuildergenerator.company.example.company.Department type.
   * @return new instance of the hu.blackbelt.emfbuildergenerator.company.example.company.Department type
   */
  public hu.blackbelt.emfbuildergenerator.company.example.company.Department build() {
    final hu.blackbelt.emfbuildergenerator.company.example.company.Department _newInstance = hu.blackbelt.emfbuildergenerator.company.example.company.CompanyFactory.eINSTANCE.createDepartment();
    if (m_featureNumberSet) {
      _newInstance.setNumber(m_number);
    }
    if (m_featureEmployeesSet) {
      _newInstance.getEmployees().addAll(m_employees);
    } else {
      if (!m_featureEmployeesBuilder.isEmpty()) {
        for (hu.blackbelt.emfbuildergenerator.company.example.company.util.builder.ICompanyBuilder<? extends hu.blackbelt.emfbuildergenerator.company.example.company.Employee> builder : m_featureEmployeesBuilder) {
          _newInstance.getEmployees().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public DepartmentBuilder withNumber(Integer p_number) {
    m_number = p_number;
    m_featureNumberSet = true;
    return this;
  }

  public DepartmentBuilder withEmployees(hu.blackbelt.emfbuildergenerator.company.example.company.Employee p_employees) {
    m_employees.add(p_employees);
    m_featureEmployeesSet = true;
    return this;
  }

  public DepartmentBuilder withEmployees(java.util.Collection<? extends hu.blackbelt.emfbuildergenerator.company.example.company.Employee> p_employees) {
    m_employees.addAll(p_employees);
    m_featureEmployeesSet = true;
    return this;
  }

  public DepartmentBuilder withEmployees(
      hu.blackbelt.emfbuildergenerator.company.example.company.util.builder.ICompanyBuilder<? extends hu.blackbelt.emfbuildergenerator.company.example.company.Employee> p_employeeBuilder) {
    m_featureEmployeesBuilder.add(p_employeeBuilder);
    return this;
  }
}
