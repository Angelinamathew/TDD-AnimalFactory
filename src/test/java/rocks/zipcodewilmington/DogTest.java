package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {


    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        String givenName = "Milo";
        Date givenBirthdate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(givenName, givenBirthdate,givenId);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void speakTest(){
        //Given
        String expected = "bark!";
        //When
        Dog dog = new Dog();
        String actual = dog.speak();
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void eat(){
        //Given
        int expected = 1;
        int actual = 0;
        //When
        Dog dog = new Dog();
        Food food = new Food();
        dog.eat(food);
        actual = dog.getNumberOfMealsEaten();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void idTest(){
        //Given
        int expected =1;

        //When
        Dog dog = new Dog(null, null,expected);
        int actual = dog.getId();
        //Then
        Assert.assertEquals(actual,dog.getName());
    }
    @Test
    public void animalTest(){
        Dog dog =  new Dog();
        Assert.assertTrue(dog instanceof Animal);

    }
    @Test
    public void mammalTest(){
        Dog dog =  new Dog();
        Assert.assertTrue(dog instanceof Mammal);

    }

}
