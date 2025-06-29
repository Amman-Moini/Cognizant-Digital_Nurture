package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataProcessorTest {

    private DataProcessor processor;

    @BeforeEach
    public void setUp() {
        processor = new DataProcessor();
    }

    @AfterEach
    public void tearDown() {
        processor.clear();
        processor = null;
    }

    @Test
    public void testAdd() {
        // Arrange: (Handled by setUp) processor is new and empty

        // Act
        processor.add("item1");
        processor.add("item2");

        // Assert
        assertEquals(2, processor.getSize());
    }

    @Test
    public void testInitialSize() {
        // Arrange: (Handled by setUp) processor is new and empty

        // Act
        int size = processor.getSize();

        // Assert
        assertEquals(0, size);
    }
}