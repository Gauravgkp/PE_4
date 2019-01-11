import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {

    Transpose transpose;
    @Before
    public void setUp() throws Exception {
        transpose = new Transpose();
    }

    @After
    public void tearDown() throws Exception {
        transpose = null;
    }

    @Test
    public void transpose() {
        //Arrange
        String[]  expectedValue ={"a", "kciuq", "nworb", "xof", "spmuj", "revo", "eht", "yzal", "god"};

        //Act
        String[]  actualValue = transpose.transpose("a quick brown fox jumps over the lazy dog");

        //Assert
        assertArrayEquals(expectedValue, actualValue);
    }

}