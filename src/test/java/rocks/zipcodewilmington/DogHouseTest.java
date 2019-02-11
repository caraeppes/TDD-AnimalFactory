package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void AddDogTest(){

        // Given
        Dog d = new Dog("Puffy Fluffy", new Date(), 1);

        // When
        DogHouse.add(d);

        // Then
        Assert.assertEquals(d, DogHouse.getDogById(1));
    }

    @Test
    public void RemoveDogTest(){

        // Given
        Dog d = new Dog("Puffy Fluffy", new Date(), 12);
        DogHouse.add(d);

        // When
        DogHouse.remove(d);

        // Then
        Assert.assertEquals(null, DogHouse.getDogById(12));

    }

    @Test
    public void RemoveDogWithIdTest(){

        // Given
        Dog d = new Dog("Puffy Fluffy", new Date(), 1234);
        DogHouse.add(d);

        // When
        DogHouse.remove(1234);

        // Then
        Assert.assertEquals(null, DogHouse.getDogById(1234));

    }

    @Test
    public void GetDogByIdTest(){

        // Given
        Integer id = 1234;
        Dog d = new Dog("Puffy Fluffy", new Date(), 1234);
        DogHouse.add(d);

        // When
        Dog d2 = DogHouse.getDogById(id);

        // Then
        Assert.assertEquals(id, d2.getId());

    }

    @Test
    public void GetNumberOfDogsTest(){

        // Given
        Dog d = new Dog("Puffy Fluffy", new Date(), 1234);
        DogHouse.clear();

        // When
        Integer numDogs = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(new Integer(0), numDogs);

        // When
        DogHouse.add(d);
        DogHouse.add(d);
        numDogs = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(new Integer(2), numDogs);
    }

}
