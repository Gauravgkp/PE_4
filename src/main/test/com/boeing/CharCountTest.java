package com.boeing;

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

//    @Test
//    public  void CharCount(){
//        //Arrange
//        int expectedValue = 10;
//
//        //Act
//        int actualValue = charCount.CharCountOne("Java is java again java");
//
//        //Assert
//        assertEquals(expectedValue, actualValue);
//    }
}