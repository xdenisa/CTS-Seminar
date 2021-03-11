package ro.ase.cts.seminar2.readers;

import ro.ase.cts.seminar2.clase.Angajat;
import ro.ase.cts.seminar2.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeReader extends Reader{
    public EmployeeReader(String fileName)
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
        scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (scanner.hasNext()) {
            Angajat angajat=new Angajat();
            super.readAplicant(scanner,angajat);
            int salariu = scanner.nextInt();
            String ocupatie = scanner.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        scanner.close();
        return angajati;
    }
}
