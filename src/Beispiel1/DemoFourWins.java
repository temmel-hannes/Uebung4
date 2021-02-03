package Beispiel1;

public class DemoFourWins {
    public static void main(String[] args) {
        FourWins game = new FourWins(7,8);

        game.playerB(2,0);
        game.playerB(2,1);
        game.playerB(2,2);
        game.playerB(2,3);

        System.out.println(game.winner());
    }

}

