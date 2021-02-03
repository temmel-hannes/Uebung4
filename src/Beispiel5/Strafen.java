package Beispiel5;

public class Strafen {
    private String vorname;
    private String nachname;
    private String kennzeichen;
    private int strafnummer;
    private double strafe;
    private byte anzahl;
    private static int cnt;

    public Strafen(String vorname, String nachname, String kennzeichen) {
        cnt++;
        this.vorname = vorname;
        this.nachname = nachname;
        this.kennzeichen = kennzeichen;
        strafnummer = cnt;
        strafe = 0;
        anzahl = 0;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public int getStrafnummer() {
        return strafnummer;
    }

    public double getStrafe() {
        if (anzahl == 1) return strafe * 0.7;
        else if (anzahl == 2) return strafe * 0.8;
        else if (anzahl == 3) return strafe * 0.9;
        else return strafe;
    }

    public byte getAnzahl() {
        return anzahl;
    }

    public void strafe(int ueberschreitung){
        anzahl++;
        if(ueberschreitung <= 20) strafe += 30;
        else if (ueberschreitung <= 30) strafe += 50;
        else if (ueberschreitung <= 50) strafe += 100;
        else if (ueberschreitung <= 100) strafe += 500;
        else if (ueberschreitung > 100) strafe += 1500;
    }

    public void verbandspaket(){
        anzahl++;
        strafe += 25;
    }

    public void alkohol(double wert){
        anzahl++;
        if (wert >= 0.5 && wert <= 1.0) strafe += 100;
        else if (wert <= 2.0) strafe += 400;
        else if (wert <= 3.0) strafe += 1000;
        else if (wert > 3.0 ) strafe +=5000;
    }

    public void sonstiges (double wert){
        anzahl++;
        strafe += wert;
    }

    public String toString() {
        return "Strafe{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", kennzeichen='" + kennzeichen + '\'' +
                ", strafnummer=" + strafnummer +
                ", strafe=" + strafe +
                ", anzahl=" + anzahl +
                '}';
    }

}
