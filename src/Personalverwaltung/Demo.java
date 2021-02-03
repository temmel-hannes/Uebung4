package Personalverwaltung;

public class Demo {
    public static void main(String[] args) {
        Employee m1 = new Employee(1,"Hannes", 5000.0, "IT");
        Employee m2 = new Employee(2,"Niki", 6000.0, "IT");
        Employee m3 = new Employee(3,"Max", 7000.0, "HR");

        EmployeeManager em1 = new EmployeeManager();

        em1.addEmployee(m1);
        em1.addEmployee(m2);
        em1.addEmployee(m3);

        System.out.println(em1.findByDepartment("HR"));
        System.out.println(em1.findByEmpNumber(1));
    }
}
