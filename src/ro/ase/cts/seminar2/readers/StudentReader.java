package ro.ase.cts.seminar2.readers;

import ro.ase.cts.seminar2.clase.Aplicant;
import ro.ase.cts.seminar2.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends Reader {
    public StudentReader(String fileName)
    {
        super(fileName);
    }
    public List<Aplicant> readAplicants() throws NumberFormatException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (scanner.hasNext()) {
            Student student=new Student();
            super.readAplicant(scanner,student);
            int an_studii = scanner.nextInt();
            String facultate = (scanner.next()).toString();
            student.setAn_studii(an_studii);
            student.setFacultate(facultate);
            studenti.add(student);
        }
        scanner.close();
        return studenti;
    }
}
