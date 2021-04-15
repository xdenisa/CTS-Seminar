package ro.ase.cts.seminar8.clase;

public class DecoratorPaste extends DecoratorAbstract{
    public DecoratorPaste(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Felicitare: Paste fericit!");
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("Paste fericit!");
    }
}
