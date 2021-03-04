package ro.ase.cts.seminar2.program;

import ro.ase.cts.seminar2.clase.Aplicant;
import ro.ase.cts.seminar2.clase.UniversalReader;
import ro.ase.cts.seminar2.readers.EmployeeReader;

import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> aplicantList;
		aplicantList = UniversalReader.readAplicants(new EmployeeReader("src/ro/ase/cts/seminar2/fisiere/angajati.txt"));
		for(var aplicant:aplicantList)
			System.out.println(aplicant.toString());
	}

}
