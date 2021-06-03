package ro.ase.cts.seminar9.command;

public class CommandMain {
    public static void main(String[] args) {
        Masa masa1=new Masa(1,false,false);

        Comanda comanda1=new ComandaOcupare(masa1);
        Comanda comanda2=new ComandaRezervare(masa1);
        Comanda comanda3=new ComandaOcupare(masa1);

        Operator operator=new Operator();
        operator.invoca(comanda1);
        operator.invoca(comanda2);
        operator.invoca(comanda3);
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

    }
}
