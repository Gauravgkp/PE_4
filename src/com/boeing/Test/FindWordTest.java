import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindWordTest {

    FindWord findWord;
    @Before
    public void setUp() throws Exception {
        findWord = new FindWord();
    }

    @After
    public void tearDown() throws Exception {
        findWord = null;
    }

    @Test
    public void findWord() {
        //Arrange


        //Act
        boolean actualValue = findWord.findWord("This is Harry.");

        //Assert
        assertTrue (actualValue);
    }

    @Test
    public void findWordFalse() {
        //Arrange


        //Act
        boolean actualValue = findWord.findWord("This is Henry.");

        //Assert
        assertFalse (actualValue);
    }
}