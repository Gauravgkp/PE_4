import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceStringTest {

    ReplaceString replaceString;
    @Before
    public void setUp() throws Exception {
        replaceString = new ReplaceString();
    }

    @After
    public void tearDown() throws Exception {
        replaceString = null;
    }

    @Test
    public void replace() {
        //Arrange
        String expectedValue ="faily fry";

        //Act
        String actualValue = replaceString.replace("daily dry");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void replaceFail() {
        //Arrange
        String expectedValue ="faity fry";

        //Act
        String actualValue = replaceString.replace("daily dry");

        //Assert
        assertNotEquals(expectedValue, actualValue);
    }
}