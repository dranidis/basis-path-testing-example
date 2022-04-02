package com.se.basis;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test
 */
public class UtilTest {

    @Test
    public void lowerLimitHigherThanUpperLimit() {
        assertEquals(0, Util.countNumbersInRange(new int[] {}, 2, 1));
    }

    @Test
    public void testAllCases() {
        assertEquals(1, Util.countNumbersInRange(new int[] { 0, 1, 3 }, 1, 2));
    }

    // @Test
    // public void numbersLower() {
    //     assertEquals(0, Util.countNumbersInRange(new int[] { 0 }, 1, 1));
    // }

    // @Test
    // public void numbersHigher() {
    //     assertEquals(0, Util.countNumbersInRange(new int[] { 2 }, 1, 1));
    // }

    // @Test
    // public void numbersWithin() {
    //     assertEquals(1, Util.countNumbersInRange(new int[] { 1 }, 1, 1));
    // }

}
