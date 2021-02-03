package Beispiel1;

public class FourWins {
    private int sizeX;
    private int sizeY;
    private char[][] charArray;

    public FourWins(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        charArray = new char[sizeY][sizeX];

        for (int i = 0; i < charArray.length; i++) { /* sizeY */
            /* sizeX */
            for (int j = 0; j < charArray[i].length; j++) charArray[i][j] = ' ';
        }
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public boolean playerA(int x, int y) {
        if(charArray[x][y] == ' '){
            charArray[x][y] = 'A';
            return true;
        }
        else {
            return false;
        }
    }

    public boolean playerB(int x, int y) {
        if(charArray[x][y] == ' '){
            charArray[x][y] = 'B';
            return true;
        }
        else {
            return false;
        }
    }

    private char fourInRow(){
        for (int i = 0; i < charArray.length; i++) {
            // Schleife für Zeilen
            for (int j = 0; j < charArray[i].length - 3; j++) {
                if (charArray[i][j] != ' '){
                    char player = charArray[i][j];
                    if (charArray[i][j+1] == player
                            && charArray[i][j+2] == player
                            && charArray[i][j+3] == player){
                        return player;
                    }
                }
            }
        }
        return 'X';
    }


    private char fourInColumn(){
            for (int i = 0; i < sizeX; i++) {
                // Schleife für Zeilen
                for (int j = 0; j < sizeY - 3; j++) {
                    if (charArray[j][i] != ' '){
                        char player = charArray[j][i];
                        if (charArray[j + 1][i] == player
                                && charArray[j + 2][i] == player
                                && charArray[j + 2][i] == player){
                            return player;
                        }
                    }
                }
            }

            return 'X';
    }

    public char winner(){
        char player = fourInRow();
        if(player != 'X'){
            return player;
        }

        player = fourInColumn();
            return player;
    }

    public void print() {
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                System.out.print(charArray[i][j] + " - ");
            }
            System.out.println();
        }
    }

}
