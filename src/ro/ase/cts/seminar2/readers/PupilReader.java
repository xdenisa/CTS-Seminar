package ro.ase.cts.seminar2.readers;

import ro.ase.cts.seminar2.clase.Aplicant;
import ro.ase.cts.seminar2.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PupilReader extends Reader{
    public PupilReader(String fileName)
    {
        super(fileName);
    }
    public List<Aplicant> readAplicants() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (scanner.hasNext()) {
           Elev elev=new Elev();
           super.readAplicant(scanner,elev);
            int clasa = scanner.nextInt();
            String tutore = scanner.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        scanner.close();
        return elevi;
    }
}
