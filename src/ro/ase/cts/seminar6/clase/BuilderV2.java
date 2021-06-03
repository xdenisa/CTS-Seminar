package ro.ase.cts.seminar6.clase;

public class BuilderV2 implements AbstractBuilder {
    private int codRezervare;
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoareInclusa;
    private boolean muzicaAmbientalaPersonalizata;
    private String genMuzica;

    public BuilderV2(){
        codRezervare=1000;
        scaunErgonomic=mancareInclusa=bauturaRacoritoareInclusa=muzicaAmbientalaPersonalizata=false;
        genMuzica="";
    }

    @Override
    public Rezervare build() {
        return new Rezervare(codRezervare,mancareInclusa,scaunErgonomic,bauturaRacoritoareInclusa,muzicaAmbientalaPersonalizata,genMuzica);
    }

    public BuilderV2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }

    public BuilderV2 setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
        return this;
    }

    public BuilderV2 setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    public BuilderV2 setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
        this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
        return this;
    }

    public BuilderV2 setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        return this;
    }

    public BuilderV2 setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }
}
