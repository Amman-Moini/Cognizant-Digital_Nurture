package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {
    @Test
    public void testAssertions() {
        String str = null;
        String str2 = "hello";

        assertEquals(5, 2 + 3);
        assertTrue("Condition should be true", 5 > 3);
        assertFalse("Condition should be false", 5 < 3);
        assertNull("Object should be null", str);
        assertNotNull("Object should not be null", str2);

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        assertArrayEquals("Arrays should be equal", array1, array2);
    }
}