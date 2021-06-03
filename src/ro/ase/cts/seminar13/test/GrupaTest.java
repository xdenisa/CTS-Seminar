package ro.ase.cts.seminar13.test;

import org.junit.Before;
import org.junit.Test;
import ro.ase.cts.seminar13.clase.Grupa;
import ro.ase.cts.seminar13.clase.IStudent;
import ro.ase.cts.seminar13.clase.Student;

import static org.junit.Assert.*;

public class GrupaTest {
    private Grupa grupa;

    @Before
    public void setup(){
        grupa=new Grupa(1081);
        for(int i=0;i<20;i++) {
            IStudent student = new Student();
            student.adaugaNota(9);
            student.adaugaNota(10);
            grupa.adaugaStudent(student);
        }
        for(int i=0;i<15;i++) {
            IStudent student = new Student();
            student.adaugaNota(4);
            student.adaugaNota(5);
            grupa.adaugaStudent(student);
        }
    }


    @Test
    public void testConstructorNrGrupaCorect(){
        Grupa grupa=new Grupa(1081);
        assertEquals(1081,grupa.getNrGrupa());
    }

    @Test
    public void testConstructorAlocareMemorie(){
        Grupa grupa=new Grupa(1081);
        assertNotNull(grupa.getStudenti());
    }

    @Test
    public void testConstructorNrGrupaMinim() {
        Grupa grupa = new Grupa(1000);
        assertEquals(1000, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorNrGrupaMaxim() {
        Grupa grupa = new Grupa(1100);
        assertEquals(1100, grupa.getNrGrupa());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEroareConstructorGrupaMinim() {
        Grupa grupa = new Grupa(900);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEroareConstructorGrupaMaxim() {
        Grupa grupa = new Grupa(1200);
    }

    @Test(timeout = 500)
    public void testConstructorPerformanta() {
        Grupa grupa = new Grupa(1080);
    }

    @Test
    public void testGetPromovabilitateRight() {
        Grupa grupa = new Grupa(1081);
        for(int i=0;i<10;i++) {
            IStudent student = new Student();
            student.adaugaNota(6);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }
        for(int i=0;i<5;i++) {
            IStudent student = new Student();
            student.adaugaNota(4);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }

        assertEquals(0.66f, grupa.getPromovabilitate(), 0.01);
    }

    @Test
    public void testPromovabilitateMinima() {
        Grupa grupa = new Grupa(1070);
        for(int i=0;i<5;i++) {
            IStudent student = new Student();
            student.adaugaNota(4);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }

        assertEquals(0, grupa.getPromovabilitate(), 0.01);
    }

    @Test
    public void testPromovabilitateMaxima() {
        Grupa grupa = new Grupa(1081);
        for(int i=0;i<5;i++) {
            IStudent student = new Student();
            student.adaugaNota(8);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }

        assertEquals(1, grupa.getPromovabilitate(), 0.01);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetPromovabilitateEroare() {
        Grupa grupa = new Grupa(1080);

        grupa.getPromovabilitate();
    }

    @Test(timeout = 500)
    public void testGetPromovabilitatePerformanta() {
        Grupa grupa = new Grupa(1081);


        grupa.getPromovabilitate();
    }
}