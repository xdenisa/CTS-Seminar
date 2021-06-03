package ro.ase.cts.seminar7.decorator;

public abstract class DecoratorAbstract extends BiletAbstract {
    private BiletAbstract biletAbstract;

    public DecoratorAbstract(BiletAbstract biletAbstract){
        this.biletAbstract=biletAbstract;
    }

    public BiletAbstract getBiletAbstract() {
        return biletAbstract;
    }

    @Override
    public void rezervaBilet() {
        this.biletAbstract.rezervaBilet();
    }
}
