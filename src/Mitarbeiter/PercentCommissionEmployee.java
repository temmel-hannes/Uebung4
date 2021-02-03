package Mitarbeiter;

public class PercentCommissionEmployee extends Empleyee {
    protected double percentCommission;

    public PercentCommissionEmployee(String lastname, String firstname, String department, double baseSalary, double percentCommission) {
        super(lastname, firstname, department, baseSalary);
        this.percentCommission = percentCommission;
    }

    public double getFullSalary(){
        return super.getFullSalary() *(1+percentCommission) ;
    }
}
