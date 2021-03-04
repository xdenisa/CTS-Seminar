package ro.ase.cts.seminar2.program;

import ro.ase.cts.seminar2.clase.Angajat;
import ro.ase.cts.seminar2.clase.Utils;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Angajat> listaAngajati;
		try {
			listaAngajati = Utils.readAngajati("D:\\1.FACULTATE\\Anul 3\\Semestrul 2\\Calitate si testare software\\Seminar\\Github\\src\\ro\\ase\\cts\\seminar2\\fisiere\\angajati.txt");
			for(Angajat angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
