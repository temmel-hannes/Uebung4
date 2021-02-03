package PegelVerwaltung;

public class Wasserstand {
    private int id;
    private String gewaesserName;
    private double messWert;
    private double messWertFürAlamierung;
    private int zeitpunkt;

    public Wasserstand(int id, String gewaesserName, double messWert, double messWertFürAlamierung, int zeitpunkt) {
        super();
        this.id = id;
        this.gewaesserName = gewaesserName;
        this.messWert = messWert;
        this.messWertFürAlamierung = messWertFürAlamierung;
        this.zeitpunkt = zeitpunkt;
    }

    public int getId() {
        return id;
    }

    public String getGewaesserName() {
        return gewaesserName;
    }

    public double getMessWert() {
        return messWert;
    }

    public double getMessWertFürAlamierung() {
        return messWertFürAlamierung;
    }

    public int getZeitpunkt() {
        return zeitpunkt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGewaesserName(String gewaesserName) {
        this.gewaesserName = gewaesserName;
    }

    public void setMessWert(double messWert) {
        this.messWert = messWert;
    }

    public void setMessWertFürAlamierung(double messWertFürAlamierung) {
        this.messWertFürAlamierung = messWertFürAlamierung;
    }

    public void setZeitpunkt(int zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
    }

    @Override
    public String toString() {
        return "Wasserstand{" +
                "id=" + id +
                ", gewaesserName='" + gewaesserName + '\'' +
                ", messWert=" + messWert +
                ", messWertFürAlamierung=" + messWertFürAlamierung +
                ", zeitpunkt=" + zeitpunkt +
                '}';
    }
}
