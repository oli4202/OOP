public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        Employee employee = new Employee("Bob", "Blue", birth, hire);

        // Display employee information using toString()
        System.out.println("\nEmployee information:\n" + employee);
    }
}
