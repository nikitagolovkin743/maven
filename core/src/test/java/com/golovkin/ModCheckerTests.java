package com.golovkin;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ModCheckerTests {
    @Test
    public void IsOdd_OddNumber_ReturnTrue() {
        boolean isOdd = ModChecker.IsOdd(1);

        assertTrue(isOdd);
    }
}
