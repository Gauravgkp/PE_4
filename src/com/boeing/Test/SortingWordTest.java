import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingWordTest {

    SortingWord sortingWord;
    @Before
    public void setUp() throws Exception {
        sortingWord = new SortingWord();
    }

    @After
    public void tearDown() throws Exception {
        sortingWord=null;
    }

    @Test
    public void sortState() {
        //Arrange
        String[] expectedValue ={"Cdjava","Cgain","again","bagin"};

        //Act
        String[] actualValue = sortingWord.sortState("again bagin Cgain Cdjava");

        //Assert
        assertArrayEquals(expectedValue, actualValue);
    }
}