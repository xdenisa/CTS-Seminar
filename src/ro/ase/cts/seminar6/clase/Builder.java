package ro.ase.cts.seminar6.clase;

public class Builder implements AbstractBuilder{

    private Rezervare rezervare;

    public Builder(){
        this.rezervare=new Rezervare();
    }

    public Builder(int codRezervare){
        this.rezervare=new Rezervare();
        this.rezervare.setCodRezervare(codRezervare);
    }

    @Override
    public Rezervare build() {
        return this.rezervare;
    }

    public Builder setMancareInclusa(boolean mancareInclusa) {
        this.rezervare.setMancareInclusa(mancareInclusa);
        return this;
    }

    public Builder setCodRezervare(int codRezervare) {
        this.rezervare.setCodRezervare(codRezervare);
        return  this;
    }

    public Builder setScaunErgonomic(boolean scaunErgonomic) {
        this.rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }

    public Builder setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
        this.rezervare.setBauturaRacoritoareInclusa(bauturaRacoritoareInclusa);
        return this;
    }

    public Builder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.rezervare.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
        return this;
    }

    public Builder setGenMuzica(String genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }
}
