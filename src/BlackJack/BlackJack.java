package BlackJack;

import java.util.HashMap;

public class BlackJack {
    private HashMap<Player, Integer> players = new HashMap<>();

    boolean add(Player player){
        if(players.containsKey(player)){
            return false;
        }
        else {
            players.put(player, 0);
            return true;
        }
    }

    boolean addCard(Player player, Integer cardValue){
        if(players.containsKey(player)){
            players.put(player, players.get(player) + cardValue);
            return true;
        }
        else return false;
    }

    Integer getValue(Player player){
        if (players.containsKey(player)){
            return players.get(player);
        }
        else return null;
    }

    @Override
    public String toString() {
        String result = "";
        if (players.size() == 0) return "Kein Spieler vorhanden.";
        else {
            for (Player player : players.keySet()){
                result = "Name: " + player.getName() + "Kartenwert: " + players.get(player);
            }
        }
        return result;
    }
}
