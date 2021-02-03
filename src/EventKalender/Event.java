package EventKalender;

public class Event {
    private String title;
    private String ort;
    private double preis;

    public Event(String title, String ort, double preis) {
        this.title = title;
        this.ort = ort;
        this.preis = preis;
    }

    public String getTitle() {
        return title;
    }

    public String getOrt() {
        return ort;
    }

    public double getPreis() {
        return preis;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String toString(){
        return "Event{" +
                "Titel='" + title + '\'' +
                ", Ort='" + ort + '\'' +
                ", Preis='" + preis + '\'' +
                '}';
    }
}
