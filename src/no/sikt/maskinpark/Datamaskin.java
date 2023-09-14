package no.sikt.maskinpark;

public class Datamaskin {
    protected int arsmodell;
    protected int pris;
    protected int vekt;
    protected String merke;
    protected String prosessor;
    public int getArsmodell() {
        return arsmodell;
    }

    private static int antallDatamaskiner;

    public static int getAntallDatamaskiner() {
        return antallDatamaskiner;
    }

    public Datamaskin() {
        antallDatamaskiner++;
    }

    public void setArsmodell(int arsmodell) {
        this.arsmodell = arsmodell;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public int getVekt() {
        return vekt;
    }

    public void setVekt(int vekt) {
        this.vekt = vekt;
    }

    public String getMerke() {
        return merke;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public String getProsessor() {
        return prosessor;
    }

    public void setProsessor(String prosessor) {
        this.prosessor = prosessor;
    }
}
