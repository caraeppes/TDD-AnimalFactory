package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.Cat;
import java.util.Date;
import org.junit.Assert;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    @Test
    public void AddCatTest(){

        // Given
        Cat c = new Cat("Gilligan", new Date(), 1234);

        // When
        CatHouse.add(c);

        // Then
        Assert.assertEquals(c, CatHouse.getCatById(1234));
    }

    @Test
    public void RemoveCatTest(){

        // Given
        Cat c = new Cat("Gilligan", new Date(), 1234);
        CatHouse.add(c);

        // When
        CatHouse.remove(c);

        // Then
        Assert.assertEquals(null, CatHouse.getCatById(1234));

    }

    @Test
    public void RemoveCatWithIdTest(){

        // Given
        Cat c = new Cat("Gilligan", new Date(), 1234);
        CatHouse.add(c);

        // When
        CatHouse.remove(1234);

        // Then
        Assert.assertEquals(null, CatHouse.getCatById(1234));

    }

    @Test
    public void GetCatByIdTest(){

        // Given
        Integer id = 1234;
        Cat c = new Cat("Gilligan", new Date(), id);
        CatHouse.add(c);

        // When
        Cat c2 = CatHouse.getCatById(id);

        // Then
        Assert.assertEquals(id, c2.getId());

    }

    @Test
    public void GetNumberOfCatsTest(){

        // Given
        Cat c = new Cat("Gilligan", new Date(), 1234);
        CatHouse.clear();

        // When
        Integer numCats = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(new Integer(0), numCats);

        // When
        CatHouse.add(c);
        CatHouse.add(c);
        numCats = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(new Integer(2), numCats);
    }
}
