package ro.ase.cts.seminar7.decorator;

public class Bilet extends BiletAbstract{
    private String gazda;
    private String oaspeti;
    private String numeClient;

    @Override
    public void rezervaBilet() {
        System.out.println(numeClient+" are bilet la meciul "+gazda+" "+oaspeti);
    }

    public Bilet(String gazda, String oaspeti, String numeClient) {
        this.gazda = gazda;
        this.oaspeti = oaspeti;
        this.numeClient = numeClient;
    }

    public String getGazda() {
        return gazda;
    }

    public String getOaspeti() {
        return oaspeti;
    }

    public String getNumeClient() {
        return numeClient;
    }
}
