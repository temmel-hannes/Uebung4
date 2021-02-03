package Mitarbeiter;

public class Demo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Gfrer", "Isabella", "Programming", 5.0);
        Employee e2 = new Employee("Gfrer", "Isabella", "Programming", 5.0);

        Employee e3 = new Employee("Gfrer", "Isabella", "Programming", 5.0);
        Employee e4 = new Employee("Gfrer", "Isabella", "HR", 5.0);
////        System.out.println(e1.getFullSalary());
////        System.out.println(e1.toString());
//
//        FixComissionEmployee fe1 = new FixComissionEmployee("Temmel", "Hannes","HR", 30,10);
////        System.out.println(fe1.getFullSalary());
//
//        PercentCommissionEmployee pe1 = new PercentCommissionEmployee("Kachelmaier", "Nikolas", "Programming", 20, 0.1);
////        System.out.println(pe1.getFullSalary());


        FixComissionEmployee fe1 = new FixComissionEmployee("Kachel", "Niki", "IT", 20.0, 5.0);
        PercentCommissionEmployee pe1 = new PercentCommissionEmployee("Temmel", "Hannes", "hhg", 25.0,0.1);
        PercentCommissionEmployee pe2 = new PercentCommissionEmployee("Temmel", "Hannes", "IT", 25.0,0.1);
        PercentCommissionEmployee pe3 = new PercentCommissionEmployee("Temmel", "Hannes", "IT", 25.0,0.1);
        EmployeeManager em1 = new EmployeeManager();
        em1.addEmployee(e1);
        em1.addEmployee(e2);
        em1.addEmployee(e3);
        em1.addEmployee(e4);
        em1.addEmployee(fe1);
        em1.addEmployee(pe1);
        em1.addEmployee(pe2);
        em1.addEmployee(pe3);

        System.out.println(em1.calcTotalSalary());
        System.out.println(em1.getSalaryByDepartment());
    }
}
