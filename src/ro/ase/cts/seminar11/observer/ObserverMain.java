package ro.ase.cts.seminar11.observer;

public class ObserverMain {
    public static void main(String[] args) {
        Client client=new Client("Stefan");
        Client client1=new Client("Maria");
        Client client2=new Client("Ion");
        Manager manager=new Manager();

        manager.adaugaObservator(client);
        manager.adaugaObservator(client1);
        manager.adaugaObservator(client2);
        manager.anuntaMeci("fotbal");
        manager.stergeObservator(client);
        System.out.println();
        manager.anuntaMeci("volei");
    }
}
