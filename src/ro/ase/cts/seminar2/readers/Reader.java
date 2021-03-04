package ro.ase.cts.seminar2.readers;

import ro.ase.cts.seminar2.clase.Aplicant;

import java.util.List;

public abstract class Reader {
    String fileName;

    public Reader(String fileName) {
        this.fileName=fileName;
    }

    public abstract List<Aplicant> readAplicants();
}
