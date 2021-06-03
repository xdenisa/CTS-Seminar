package ro.ase.cts.seminar11.observer;

public class Client implements Observator{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(nume+" a primit mesajul: "+mesaj);
    }
}
