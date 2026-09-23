package exercice_2;

import exercice_2.model.Employee;
import exercice_2.model.Manager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Employee employee = new Employee("John Doe", 50000L);
        Manager manager = new Manager("Jane Smith", 70000L, 20000L);

        System.out.println("Employee Payment: " + employee.calculatePayment());
        System.out.println("Manager Payment: " + manager.calculatePayment());
    }
}
