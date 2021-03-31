package ro.ase.cts.seminar2.readers;

import ro.ase.cts.seminar2.clase.Aplicant;

import java.util.List;
import java.util.Scanner;

public abstract class Reader {
    String fileName;

    public Reader(String fileName) {
        this.fileName=fileName;
    }

    public abstract List<Aplicant> readAplicants();
    public Aplicant readAplicant(Scanner scanner,Aplicant aplicant){
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int numarProiecte = scanner.nextInt();
        String[] denumiriProiecte = new String[5];
        for (int i = 0; i < numarProiecte; i++)
            denumiriProiecte[i] = scanner.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNr_proiecte(numarProiecte);
        aplicant.setVectorDenumiri(denumiriProiecte,numarProiecte);
        return aplicant;
    }
}
