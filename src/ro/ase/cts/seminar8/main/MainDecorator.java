package ro.ase.cts.seminar8.main;

import ro.ase.cts.seminar8.clase.DecoratorAbstract;
import ro.ase.cts.seminar8.clase.DecoratorFelicitare;
import ro.ase.cts.seminar8.clase.DecoratorPaste;
import ro.ase.cts.seminar8.clase.NotaDePlata;

public class MainDecorator {
    public static void main(String[] args) {
        NotaDePlata notaDePlata=new NotaDePlata(40);
        notaDePlata.printeaza();

        DecoratorFelicitare decoratorFelicitare=new DecoratorFelicitare(notaDePlata);
        decoratorFelicitare.printeazaFelicitare();
        System.out.println();
        decoratorFelicitare.printeaza();
        System.out.println();

        DecoratorPaste decoratorPaste=new DecoratorPaste(notaDePlata);
        decoratorPaste.printeaza();
        System.out.println();

        NotaDePlata notaDePlata2=new NotaDePlata(104);
        DecoratorAbstract decoratorAbstract=new DecoratorFelicitare(notaDePlata2);
        DecoratorAbstract decoratorAbstract2=new DecoratorPaste(decoratorAbstract);
        decoratorAbstract2.printeaza();
    }
}
