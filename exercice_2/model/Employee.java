package exercice_2.model;

import exercice_2.interfaces.Payable;

public class Employee implements Payable {   
    protected String name;
    protected Long salary;

    public Employee(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public Long calculatePayment() {
        return this.salary;
    }
}
