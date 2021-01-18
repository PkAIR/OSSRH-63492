package com.github.pkair.arithmetic;

import java.math.BigDecimal;

/**
 * Simple class provides the same functionality as {@link BigDecimal}
 */
public class Operation {
    public static BigDecimal add(BigDecimal x, BigDecimal y) { return x.add(y); }

    public static BigDecimal substract(BigDecimal x, BigDecimal y) { return x.subtract(y); }

    public static BigDecimal multiply(BigDecimal x, BigDecimal y) { return x.multiply(y); }

    public static BigDecimal divide(BigDecimal x, BigDecimal y) { return x.divide(y); }
}
