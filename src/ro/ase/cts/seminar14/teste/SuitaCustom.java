package ro.ase.cts.seminar14.teste;


import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.seminar14.teste.categorii.ConstructorCategory;
import ro.ase.cts.seminar14.teste.categorii.TesteUrgente;

@RunWith(Categories.class)
@Suite.SuiteClasses({GrupaTest.class,MockTest.class})
//@Categories.IncludeCategory(ConstructorCategory.class)
@Categories.ExcludeCategory(TesteUrgente.class)
public class SuitaCustom {
}
