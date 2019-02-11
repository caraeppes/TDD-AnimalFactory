package rocks.zipcodewilmington;

import org.junit.Test;
import org.junit.Assert;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Cat;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    @Test
    public void CreateDogTest(){

        // Given
        AnimalFactory af = new AnimalFactory();
        String givenName = "Puffy Fluffy";
        Date givenDate = new Date(1234);

        // When
        Dog d = af.createDog(givenName, givenDate);

        // Then
        Assert.assertEquals(givenName, d.getName());
        Assert.assertEquals(givenDate, d.getBirthDate());

    }

    @Test
    public void CreateCatTest(){

        // Given
        AnimalFactory af = new AnimalFactory();
        String givenName = "Gilligan";
        Date givenDate = new Date(1234);

        // When
        Cat c = af.createCat(givenName, givenDate);

        // Then
        Assert.assertEquals(givenName, c.getName());
        Assert.assertEquals(givenDate, c.getBirthDate());

    }


}
