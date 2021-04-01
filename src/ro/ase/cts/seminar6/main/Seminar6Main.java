package ro.ase.cts.seminar6.main;

import ro.ase.cts.seminar6.clase.Builder;
import ro.ase.cts.seminar6.clase.BuilderV2;
import ro.ase.cts.seminar6.clase.Rezervare;

public class Seminar6Main {
    public static void main(String[] args) {

        Builder builder=new Builder().setGenMuzica("Populara").setBauturaRacoritoareInclusa(true).setCodRezervare(7);
        Rezervare rezervare1=builder.build();
        System.out.println(rezervare1);

//        Builder builder1=new Builder(4).setMancareInclusa(true).setScaunErgonomic(true);
        builder.setCodRezervare(4).setScaunErgonomic(true).setMancareInclusa(true)
                .setBauturaRacoritoareInclusa(false).setGenMuzica("");
        Rezervare rezervare2= builder.build();
        System.out.println(rezervare2);

        Rezervare rezervare3=new Builder(10).setMancareInclusa(true).build();
        System.out.println(rezervare3);

        Rezervare rezervare4=new Rezervare(2,true,
                true,true,
                true,"Muzica");
        System.out.println(rezervare4);

        System.out.println("\n***********************************\n");

        BuilderV2 builderV2=new BuilderV2().setBauturaRacoritoareInclusa(true)
                .setMancareInclusa(true)
                .setScaunErgonomic(true);
        Rezervare rezervare5=builderV2.setCodRezervare(1005).build();
        Rezervare rezervare6=builderV2.setCodRezervare(1006).build();
        System.out.println(rezervare5);
        System.out.println(rezervare6);
    }
}
