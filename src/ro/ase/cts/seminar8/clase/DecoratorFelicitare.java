package ro.ase.cts.seminar8.clase;

public class DecoratorFelicitare extends DecoratorAbstract{
    public DecoratorFelicitare(INota nota) {
        super(nota);
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("La multi ani!");
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani!Felicitare!");
    }
}
