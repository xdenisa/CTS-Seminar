package ro.ase.cts.seminar9.command;

public class ComandaOcupare  extends Comanda{
    public ComandaOcupare(Masa masa) {
        super.masa=masa;
    }

    @Override
    public void executa() {
    masa.ocupa();
    }
}
