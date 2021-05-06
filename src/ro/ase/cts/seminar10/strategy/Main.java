package ro.ase.cts.seminar10.strategy;

public class Main {
    public static void main(String[] args) {
            Client client1=new Client("Client 1");

            client1.efectueazaPlata(20);
            client1.setMetodaPlata(new PlataCard());
            client1.efectueazaPlata(20);

            client1.setMetodaPlata(new PlataCash());
            client1.efectueazaPlata(30);
    }
}
