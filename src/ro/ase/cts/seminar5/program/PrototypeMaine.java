package ro.ase.cts.seminar5.program;

import ro.ase.cts.seminar5.clase.prototype.PrototypeAbstract;
import ro.ase.cts.seminar5.clase.prototype.Reteta;

public class PrototypeMaine {
    public static void main(String[] args) {
        PrototypeAbstract reteta1=new Reteta("Paracetamol",250);
        PrototypeAbstract reteta2= reteta1.clone();

        System.out.println(reteta1);
        System.out.println(reteta2);
    }
}
