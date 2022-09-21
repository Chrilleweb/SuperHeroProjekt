import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    private Database database;

    @BeforeEach
    void prepareTest(){
        database = new Database();
    }

    @Test
    void createSuperhero() {
        //Arrange
        //Act
        database.createSuperhero("batman", "flyve", "assdd", 23, "ja", 456);

        ArrayList<Superhero> results = database.getSuperheros();
        //Assert
        int actualSize = results.size();
        int expectedSize = 1;

        assertEquals(actualSize, expectedSize);
    }

    @Test
    void searchFor(){
        //Arrange
        String expected = null;
        //Act
        Superhero data = database.searchFor("hej");
        //Assert
        assertEquals(expected, data);
    }


}