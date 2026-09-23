package exercice_2.model;

public class Manager extends Employee {
    private Long bonus;

    public Manager(String name, Long salary, Long bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public Long getBonus() {
        return bonus;
    }

    public void setBonus(Long bonus) {
        this.bonus = bonus;
    }

    @Override
    public Long calculatePayment() {
        return this.salary + this.bonus;
    }
}
