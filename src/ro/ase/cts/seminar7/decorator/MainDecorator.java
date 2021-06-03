package ro.ase.cts.seminar7.decorator;

public class MainDecorator {
    public static void main(String[] args) {
        Bilet bilet=new Bilet("Echipa 1","Echipa 2","Client");
        bilet.rezervaBilet();

        Decorator decorator=new Decorator(bilet);
        decorator.rezervaBilet();
    }
}
