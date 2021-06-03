package ro.ase.cts.seminar12.tests;

import org.junit.Test;
import ro.ase.cts.seminar12.clase.Student;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testConstructorParametru()
    {
        String nume="Costica";
        Student student=new Student(nume);

        assertEquals(nume,student.getNume());
        assertNotNull(student.getNote());
    }

    @Test
    public void testConstructorFaraParametri()
    {
        Student student=new Student();
        assertNotNull(student.getNume());
        assertNotNull(student.getNote());
    }

    @Test
    public void testAdaugaNota()
    {
        int nota=5;
        Student student=new Student();
        student.adaugaNota(nota);

        assertEquals(nota,student.getNota(0));
    }

    @Test
    public void testAdaugaNotaCorect()
    {
        int nota=5;
        Student student=new Student();
        student.adaugaNota(nota);
        student.adaugaNota(nota);

        assertEquals(2,student.getNote().size());

    }

    @Test
    public void testCalculeazaMedie()
    {
        Student student=new Student();
        student.adaugaNota(8);
        student.adaugaNota(5);

        assertEquals((float)(8+5)/2,student.calculeazaMedie(),2);
    }
}