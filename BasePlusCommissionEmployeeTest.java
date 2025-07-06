public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        // instantiate BasePlusCommissionEmployee object
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
            "Bob", "Lewis", "333-33-3333", 5000.00, 0.04, 300.00);

        // get base-salaried commission employee data
        System.out.printf("Employee information obtained by get methods:%n");
        System.out.printf("%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());

        // give employee a 10% raise to base salary
        employee.setBaseSalary(employee.getBaseSalary() * 1.10);

        // display updated employee information using toString
        System.out.printf("%nUpdated employee information obtained by toString:%n%n%s%n", employee);
    }
}
