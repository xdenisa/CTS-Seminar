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
        int nr = scanner.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = scanner.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNr_proiecte(nr);
        aplicant.setVectorDenumiri(vect,nr);
        return aplicant;
    }
}
