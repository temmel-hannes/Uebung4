package Mitarbeiter;

public class Demo {
    public static void main(String[] args) {
        Empleyee e1 = new Empleyee("Gfrer", "Isabella", "HR", 50000.0);
        System.out.println(e1.getFullSalary());
        System.out.println(e1.toString());

        FixComissionEmployee fe1 = new FixComissionEmployee("Temmel", "Hannes","Programming", 20000.0,5000.0);
        System.out.println(fe1.getFullSalary());

        PercentCommissionEmployee pe1 = new PercentCommissionEmployee("Kachelmaier", "Nikolas", "Programming", 5000000.0, 0.6);
        System.out.println(pe1.getFullSalary());
    }
}
