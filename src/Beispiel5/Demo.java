package Beispiel5;

public class Demo {
    public static void main(String[] args) {
        Strafen Isabella = new Strafen("Isabella", "Gfrerer", "SP180C");


        Isabella.strafe(186);
        System.out.println(Isabella.toString());
        System.out.println(Isabella.getStrafe());
    }
}
