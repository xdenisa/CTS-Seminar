package ro.ase.cts.seminar6.adapter;

public class AdapterMain {

    public static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet){
        bilet.rezerva();
        bilet.vanzare();
    }

    public static void rezervaSiAfiseazaBiletOnline(IBiletOnline biletOnline)
    {
        biletOnline.rezervaOnline();
        biletOnline.vindeOnline();
    }

    public static void main(String[] args) {
            Bilet bilet=new Bilet(5f);
            rezervaSiAfiseazaBiletLaCasa(bilet);
            BiletAdapter biletAdapter=new BiletAdapter(new Bilet(7.8f));
            rezervaSiAfiseazaBiletOnline(biletAdapter);

            BiletAdapter2 biletAdapter2=new BiletAdapter2(4.6f);
            rezervaSiAfiseazaBiletOnline(biletAdapter2);
    }
}
