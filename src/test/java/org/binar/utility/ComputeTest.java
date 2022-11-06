package org.binar.utility;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComputeTest {
    private static List<Integer> sampleScore;
    private static List<Integer> emptySampleScore;

    @BeforeAll
    public static void setUp() {
        sampleScore = new ArrayList<>(Arrays.asList(7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 7, 7, 10));
    }

    @Test
    @DisplayName("Test Mean")
    public void testMean() {
        Compute c = new Compute();
        assertEquals(8.346153846153847, c.getAverage(sampleScore));
    }

    @Test
    @DisplayName("Test Mean Negative")
    public void testMeanNegative() {
        Compute c = new Compute();
        Throwable e = assertThrows(NullPointerException.class, () -> c.getAverage(emptySampleScore));
        assertNull(e.getMessage());
    }

    @Test
    @DisplayName("Test Median")
    public void testMedian() {
        Compute c = new Compute();
        assertEquals(8.5, c.getMedian(sampleScore));
    }

    @Test
    @DisplayName("Test Median Negative")
    public void testMedianNegative() {
        Compute c = new Compute();
        Throwable e = assertThrows(NullPointerException.class, () -> c.getMedian(emptySampleScore));
        assertNull(e.getMessage());
    }

    @Test
    @DisplayName("Test Mode")
    public void testMode() {
        Compute c = new Compute();
        assertEquals(7, c.getMode(sampleScore));
    }

    @Test
    @DisplayName("Test Mode Negative")
    public void testModeNegative() {
        Compute c = new Compute();
        Throwable e = assertThrows(NullPointerException.class, () -> c.getMode(emptySampleScore));
        assertNull(e.getMessage());
    }
}