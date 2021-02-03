package BlackJack;

public class Demo {
    public static void main(String[] args) {
        Player p1 = new Player("Hannes", 19);
        Player p2 = new Player("Nikolas", 21);

        BlackJack spiel1 = new BlackJack();

        spiel1.add(p1);
        spiel1.add(p2);

        System.out.println(spiel1.getValue(p1));
        System.out.println(spiel1.addCard(p1, 6));
        System.out.println(spiel1.getValue(p1));
        System.out.println(spiel1.addCard(p1, 8));
        System.out.println(spiel1.getValue(p1));

        System.out.println(spiel1.toString());
    }



}
