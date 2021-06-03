package ro.ase.cts.seminar14.teste;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.seminar14.clase.Grupa;
import ro.ase.cts.seminar14.clase.IStudent;
import ro.ase.cts.seminar14.clase.Student;
import ro.ase.cts.seminar14.teste.categorii.ConstructorCategory;
import ro.ase.cts.seminar14.teste.categorii.GetPromovabilitateCategory;
import ro.ase.cts.seminar14.teste.categorii.TesteUrgente;

import static org.junit.Assert.*;

public class GrupaTest {
    private Grupa grupa;

    @Test
    @Category(ConstructorCategory.class)
    public void testConstructorNrGrupa() {
        Grupa grupa = new Grupa(1081);
        assertEquals(1081, grupa.getNrGrupa());
    }

    @Test
    @Category(ConstructorCategory.class)
    public void testConstructorExistentaListaStudenti() {
        Grupa grupa = new Grupa(1081);
        assertNotNull(grupa.getStudenti());
    }

    @Test
    @Category(ConstructorCategory.class)
    public void testConstructorNrGrupaMinim() {
        Grupa grupa = new Grupa(1000);
        assertEquals(1000, grupa.getNrGrupa());
    }

    @Test
    @Category(ConstructorCategory.class)
    public void testConstructorNrGrupaMaxim() {
        Grupa grupa = new Grupa(1100);
        assertEquals(1100, grupa.getNrGrupa());
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(ConstructorCategory.class)
    public void testEroareConstructorGrupaMinim() {
        Grupa grupa = new Grupa(900);
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(ConstructorCategory.class)
    public void testEroareConstructorGrupaMaxim() {
        Grupa grupa = new Grupa(1200);
    }

    @Test(timeout = 500)
    @Category(ConstructorCategory.class)
    public void testConstructorPerformanta() {
        Grupa grupa = new Grupa(1080);
    }

    @Before
    public void setupGrupa() {
        grupa = new Grupa(1081);
        for(int i=0;i<400;i++) {
            IStudent student = new Student();
            student.adaugaNota(9);
            student.adaugaNota(10);
            grupa.adaugaStudent(student);
        }
        for(int i=0;i<100;i++) {
            IStudent student = new Student();
            student.adaugaNota(4);
            student.adaugaNota(5);
            grupa.adaugaStudent(student);
        }
    }

    @Test(timeout = 500)
    @Category(GetPromovabilitateCategory.class)
    public void testGetPromovabilitatePerformanta() {
        grupa.getPromovabilitate();
    }

    @Test
    @Category(GetPromovabilitateCategory.class)
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
    @Category(GetPromovabilitateCategory.class)
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
    @Category(GetPromovabilitateCategory.class)
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
    @Category({GetPromovabilitateCategory.class, TesteUrgente.class})
    public void testGetPromovabilitateEroare() {
        Grupa grupa = new Grupa(1080);

        grupa.getPromovabilitate();
    }
}