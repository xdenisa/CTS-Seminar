package ro.ase.cts.seminar2.clase;


import ro.ase.cts.seminar2.readers.Reader;

import java.util.List;

public class UniversalReader {
    public static List<Aplicant> readAplicants(Reader reader)
    {
        return reader.readAplicants();
    }
}
