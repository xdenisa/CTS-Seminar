package ro.ase.cts.seminar9.command;

public class ComandaRezervare extends Comanda{
    public ComandaRezervare(Masa masa) {
        super.masa=masa;
    }

    @Override
    public void executa() {
        masa.rezerva();
    }
}
