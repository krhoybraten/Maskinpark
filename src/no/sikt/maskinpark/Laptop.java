package no.sikt.maskinpark;

public class Laptop extends Datamaskin {

    protected int skjermstorrelse;
    protected String batteriType;

    private static int antallLaptoper;

    public Laptop() {
        super();
        antallLaptoper++;
    }

    public Laptop(String merke, int arsmodell, int pris) {
        this();
        this.arsmodell = arsmodell;
        this.pris = pris;
        this.merke = merke;
    }

    public static int getAntallLaptoper() {
        return antallLaptoper;
    }

    public int getSkjermstorrelse() {
        return skjermstorrelse;
    }

    public int getArsmodell() {
        return arsmodell;
    }

    public int getPris() {
        return pris;
    }

    public int getVekt() {
        return vekt;
    }

    public String getBatteriType() {
        return batteriType;
    }

    public String getMerke() {
        return merke;
    }

    public String getProsessor() {
        return prosessor;
    }

    public void setSkjermstorrelse(int skjermstorrelse) {
        this.skjermstorrelse = skjermstorrelse;
    }

    public void setArsmodell(int arsmodell) {
        this.arsmodell = arsmodell;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public void setVekt(int vekt) {
        this.vekt = vekt;
    }

    public void setBatteriType(String batteriType) {
        this.batteriType = batteriType;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public void setProsessor(String prosessor) {
        this.prosessor = prosessor;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "skjermstorrelse=" + skjermstorrelse +
                ", arsmodell=" + arsmodell +
                ", pris=" + pris +
                ", vekt=" + vekt +
                ", batteriType='" + batteriType + '\'' +
                ", merke='" + merke + '\'' +
                ", prosessor='" + prosessor + '\'' +
                '}';
    }




}
