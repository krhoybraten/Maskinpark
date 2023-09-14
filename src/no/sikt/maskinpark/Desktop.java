package no.sikt.maskinpark;

public class Desktop extends Datamaskin {

    private String kabinettype;
    private static int antallDesktoper;

    public Desktop() {
        super();
        antallDesktoper++;
    }

    public Desktop(String kabinettype) {
        this.kabinettype = kabinettype;
    }

    public String getKabinettype() {
        return kabinettype;
    }

    public static int getAntallDesktoper() {
        return antallDesktoper;
    }

    public void setKabinettype(String kabinettype) {
        this.kabinettype = kabinettype;
    }
}
