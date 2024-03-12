package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {




    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest(){
        //Given
        String givenName = "Chikku";
        //When
        Cat cat = new Cat();
        cat.setName(givenName);
        //Then
        Assert.assertEquals(givenName,cat.getName());
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        //Given
        String expected = "meow!";
        //When
        Cat cat = new Cat();
        String actual = cat.speak();
        //Then
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDate(){
        //Given
        Date expected = new Date();

        //When
        Cat cat = new Cat();
        cat.setBirthDate(expected);
        //Then
        Assert.assertEquals(expected,cat.getBirthDate());

    }
    // TODO - Create tests for `void eat(Food food)`
    public void eat(){
        //Given
        Food actual = new Food();

        //When
        Cat cat = new Cat();

    }




}
