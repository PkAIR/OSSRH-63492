package com.github.pkair.arithmetic;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class OperationTests{
    @Test
    public void positiveAddTest() {
        BigDecimal x = BigDecimal.valueOf(3);
        BigDecimal y = BigDecimal.valueOf(2);
        assertEquals(BigDecimal.valueOf(5), Operation.add(x, y));
    }

    @Test
    public void negativeAddTest() {
        BigDecimal x = BigDecimal.valueOf(3);
        BigDecimal y = BigDecimal.valueOf(2);
        assertNotEquals(BigDecimal.valueOf(6), Operation.add(x, y));
    }
}
