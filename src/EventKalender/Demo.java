package EventKalender;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Event e1 = new Event("Konzert X", "Graz", 45.00);
        Event e2 = new Event("Theater Y", "Graz", 35.00);
        Event e3 = new Event("Kinovorstellung Z", "Graz", 12.00);
        Event e4 = new Event("Fußballspiel A vs. B", "München", 76.00);
        Event e5 = new Event("Tennisspiel C vs. D", "London", 100.00);

        Eventkalender ek = new Eventkalender();
        ek.add(e1);
        ek.add(e2);
        ek.add(e3);
        ek.add(e4);
        ek.add(e5);

        Event byTitle = ek.getByTitle("Konzert X");
        System.out.println(byTitle);
        byTitle = ek.getByTitle("fdsaf");
        System.out.println(byTitle);

        ArrayList<Event> byOrt = ek.getByOrt("Graz");
        System.out.println(byOrt);

        ArrayList<Event> byPreis = ek.getByPreis(40,80);
        System.out.println(byPreis);

        Event mostExpensiveByOrt = ek.getMostExpensiveByOrt("Graz");
        System.out.println(mostExpensiveByOrt);

        double avg = ek.getAvgPreisByOrt("Graz");
        System.out.println(avg);

    }
}
