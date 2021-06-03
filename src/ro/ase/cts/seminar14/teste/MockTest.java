package ro.ase.cts.seminar14.teste;

import org.junit.Test;
import ro.ase.cts.seminar14.clase.Grupa;
import ro.ase.cts.seminar14.clase.IStudent;
import ro.ase.cts.seminar14.teste.mocks.DummyStudent;
import ro.ase.cts.seminar14.teste.mocks.DummyStudent2;
import ro.ase.cts.seminar14.teste.mocks.FakeStudent;

import static org.junit.Assert.*;

public class MockTest {

    @Test
    public void testAdaugaStudent(){
        Grupa grupa=new Grupa(1081);
        IStudent student=new DummyStudent();

        grupa.adaugaStudent(student);
        assertEquals(grupa.getStudenti().size(),1);
    }

    @Test
    public void testGetPromovabilitate(){
        IStudent student=new DummyStudent2();
        Grupa grupa=new Grupa(1081);

        grupa.adaugaStudent(student);
        assertEquals(grupa.getPromovabilitate(),1,0.01);
    }

    @Test
    public void testGetPromovabilitateFakeStudent(){
        Grupa grupa=new Grupa(1081);
        for(int i=0;i<8;i++)
        {
            FakeStudent student=new FakeStudent();
            student.setAreRestanta(false);
            grupa.adaugaStudent(student);
        }
        for(int i=0;i<2;i++)
        {
            FakeStudent student=new FakeStudent();
            student.setAreRestanta(true);
            grupa.adaugaStudent(student);
        }

        assertEquals(0.8f,grupa.getPromovabilitate(),0.01);
    }

}