package ro.ase.cts.seminar7.decorator;

public class Decorator extends DecoratorAbstract{

    public Decorator(BiletAbstract biletAbstract) {
        super(biletAbstract);

    }

    @Override
    public void rezervaBilet() {
        super.rezervaBilet();
        System.out.println("Sustinem "+((Bilet)super.getBiletAbstract()).getGazda());
    }
}
