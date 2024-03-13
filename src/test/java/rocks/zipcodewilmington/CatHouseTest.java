package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testAdd() {
        Cat cat = new Cat();
        Integer expected = 1;
        CatHouse.clear();
        CatHouse.add(cat);
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemoveId(){
        Cat cat = new Cat();
        Integer actual;
        Integer expected = 2;

        CatHouse.clear();
        CatHouse.add(cat);
        CatHouse.add(cat);
        actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
        CatHouse.remove(0);
        expected =1;
        actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testRemoveObj(){
        Cat cat1= new Cat();
        Cat cat2 = new Cat();
        Integer actual;
        Integer expected = 2;

        CatHouse.clear();
        CatHouse.add(cat1);
        CatHouse.add(cat1);
        actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
        CatHouse.remove(cat1);
        expected =1;
        actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testgetCatId(){
        Cat cat = new Cat();
        Cat expected = cat;
        CatHouse.clear();
        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(0);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testNoOfCat(){
        Cat cat = new Cat();
        Integer expected =1;
        CatHouse.clear();
        CatHouse.add(cat);
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }
}
