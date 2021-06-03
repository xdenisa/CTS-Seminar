package ro.ase.cts.seminar8.clase;

public abstract class DecoratorAbstract  implements  INota{

    private INota nota;

    public DecoratorAbstract(INota nota) {
        this.nota = nota;
    }

    @Override
    public void printeaza() {
        nota.printeaza();
    }

    public void printeazaFelicitare(){};
}
