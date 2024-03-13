package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void dogTest(){
        Dog dog = new Dog();
        dog = AnimalFactory.createDog("Sony", new Date());
        assert(dog instanceof Dog);

    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void catTest(){
        Cat cat = new Cat();
        cat = AnimalFactory.createCat("Meera", new Date());
        assert(cat instanceof Cat);

    }
}
