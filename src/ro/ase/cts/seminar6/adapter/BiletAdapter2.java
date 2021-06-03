package ro.ase.cts.seminar6.adapter;

public class BiletAdapter2 extends Bilet implements IBiletOnline{
    public BiletAdapter2(float pret) {
        super(pret);
    }

    @Override
    public void vindeOnline() {
        super.vanzare();
    }

    @Override
    public void rezervaOnline() {
            super.rezerva();
    }
}
