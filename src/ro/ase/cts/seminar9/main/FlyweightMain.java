package ro.ase.cts.seminar9.main;

import ro.ase.cts.seminar9.clase.Flyweight;
import ro.ase.cts.seminar9.clase.FlyweightFactory;
import ro.ase.cts.seminar9.clase.Rezervare;

public class FlyweightMain {
    public static void main(String[] args) {
        Rezervare rezervare1=new Rezervare(5,6,12);
        Rezervare rezervare2=new Rezervare(1,7,4);
        Rezervare rezervare3=new Rezervare(2,2,2);
        Rezervare rezervare4=new Rezervare(3,3,5);
        Rezervare rezervare5=new Rezervare(4,5,7);

        FlyweightFactory flyweightFactor=new FlyweightFactory();
        Flyweight client1=flyweightFactor.getFlyweight("0720");
        client1.printeazaRezervare(rezervare1);

        flyweightFactor.getFlyweight("0744").printeazaRezervare(rezervare2);
        flyweightFactor.getFlyweight("0720").printeazaRezervare(rezervare3);
        flyweightFactor.getFlyweight("0744").printeazaRezervare(rezervare4);
    }
}
