package Mitarbeiter;

public class Empleyee {
    protected String lastname;
    protected String firstname;
    protected String department;
    protected double baseSalary;

    public Empleyee(String lastname, String firstname, String department, double baseSalary) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.department = department;
        this.baseSalary = baseSalary;
    }
    public double getFullSalary(){
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Empleyee{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", department='" + department + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
