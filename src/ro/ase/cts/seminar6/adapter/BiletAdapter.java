package ro.ase.cts.seminar6.adapter;

public class BiletAdapter implements IBiletOnline {
    private Bilet bilet;

    public BiletAdapter(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void vindeOnline() {
      //  System.out.println("S-a vandut online biletul cu pretul "+bilet.getPret());
        this.bilet.vanzare();
    }

    @Override
    public void rezervaOnline() {
        //System.out.println("S-a rezervat online biletul cu pretul "+bilet.getPret());
        this.bilet.rezerva();
    }
}
