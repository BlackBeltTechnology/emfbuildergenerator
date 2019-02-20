package hu.blackbelt.emfbuildergenerator.company.example.company.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>hu.blackbelt.emfbuildergenerator.company.example.company.Company</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CompanyBuilder implements hu.blackbelt.emfbuildergenerator.company.example.company.util.builder.ICompanyBuilder<hu.blackbelt.emfbuildergenerator.company.example.company.Company> {
  // features and builders
  private java.lang.String m_name;
  private java.util.Collection<hu.blackbelt.emfbuildergenerator.company.example.company.Department> m_department = new java.util.LinkedList<hu.blackbelt.emfbuildergenerator.company.example.company.Department>();
  private java.util.Collection<hu.blackbelt.emfbuildergenerator.company.example.company.util.builder.ICompanyBuilder<? extends hu.blackbelt.emfbuildergenerator.company.example.company.Department>> m_featureDepartmentBuilder = new java.util.LinkedList<hu.blackbelt.emfbuildergenerator.company.example.company.util.builder.ICompanyBuilder<? extends hu.blackbelt.emfbuildergenerator.company.example.company.Department>>();
  // helper attributes
  private boolean m_featureDepartmentSet = false;
  private boolean m_featureNameSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newCompanyBuilder()
   */
  private CompanyBuilder() {
  }

  /**
   * This method creates a new instance of the CompanyBuilder.
   * @return new instance of the CompanyBuilder
   */
  public static CompanyBuilder create() {
    return new CompanyBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public CompanyBuilder but() {
    CompanyBuilder _builder = create();
    _builder.m_featureDepartmentSet = m_featureDepartmentSet;
    _builder.m_department = m_department;
    _builder.m_featureDepartmentBuilder = m_featureDepartmentBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    return _builder;
  }

  /**
   * This method constructs the final hu.blackbelt.emfbuildergenerator.company.example.company.Company type.
   * @return new instance of the hu.blackbelt.emfbuildergenerator.company.example.company.Company type
   */
  public hu.blackbelt.emfbuildergenerator.company.example.company.Company build() {
    final hu.blackbelt.emfbuildergenerator.company.example.company.Company _newInstance = hu.blackbelt.emfbuildergenerator.company.example.company.CompanyFactory.eINSTANCE.createCompany();
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureDepartmentSet) {
      _newInstance.getDepartment().addAll(m_department);
    } else {
      if (!m_featureDepartmentBuilder.isEmpty()) {
        for (hu.blackbelt.emfbuildergenerator.company.example.company.util.builder.ICompanyBuilder<? extends hu.blackbelt.emfbuildergenerator.company.example.company.Department> builder : m_featureDepartmentBuilder) {
          _newInstance.getDepartment().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public CompanyBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public CompanyBuilder withDepartment(hu.blackbelt.emfbuildergenerator.company.example.company.Department p_department) {
    m_department.add(p_department);
    m_featureDepartmentSet = true;
    return this;
  }

  public CompanyBuilder withDepartment(java.util.Collection<? extends hu.blackbelt.emfbuildergenerator.company.example.company.Department> p_department) {
    m_department.addAll(p_department);
    m_featureDepartmentSet = true;
    return this;
  }

  public CompanyBuilder withDepartment(
      hu.blackbelt.emfbuildergenerator.company.example.company.util.builder.ICompanyBuilder<? extends hu.blackbelt.emfbuildergenerator.company.example.company.Department> p_departmentBuilder) {
    m_featureDepartmentBuilder.add(p_departmentBuilder);
    return this;
  }
}
