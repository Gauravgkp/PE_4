import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharCountTest {

    CharCount charCount;
    @Before
    public void setUp() throws Exception {
        charCount = new CharCount();
    }

    @After
    public void tearDown() throws Exception {
        charCount = null;
    }

    @Test
    public void charCount() {
        //Arrange
        int expectedValue =7;

        //Act
        int actualValue = charCount.charCount("Java is java again java", "a");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void charCountFail() {
        //Arrange
        int expectedValue =6;

        //Act
        int actualValue = charCount.charCount("java java again java", "a");

        //Assert
        assertNotEquals(expectedValue, actualValue);
    }
}