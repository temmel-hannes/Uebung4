package Mitarbeiter;

public class FixComissionEmployee extends Employee {
    protected double additionalCommission;

    public FixComissionEmployee(String lastname, String firstname, String department, double baseSalary, double additionalCommission) {
        super(lastname, firstname, department, baseSalary);
        this.additionalCommission = additionalCommission;
    }


    @Override
    public double getFullSalary(){
        return super.getFullSalary()+additionalCommission;
    }
}
