package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BinaryTest 
{
    @Test
    public void testOr() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("0110");
        Binary result = Binary.or(binary1, binary2);
        assertTrue(result.getValue().equals("1110"));
    }

    @Test
    public void testOrWithZero() {
        Binary binary1 = new Binary("0000");
        Binary binary2 = new Binary("1011");
        Binary result = Binary.or(binary1, binary2);
        assertTrue(result.getValue().equals("1011"));
    }

    @Test
    public void testAnd() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("0110");
        Binary result = Binary.and(binary1, binary2);
        assertTrue(result.getValue().equals("10")); // Expected: 1010 & 0110 = 0010 (or just "10")
    }
    
    @Test
    public void testAndWithZero() {
        Binary binary1 = new Binary("0000");
        Binary binary2 = new Binary("1011");
        Binary result = Binary.and(binary1, binary2);
        assertTrue(result.getValue().equals("0")); // Expected: 0000 & 1011 = 0000 (should be "0")
    }
    
    
    @Test
    public void testMultiply() {
        Binary binary1 = new Binary("101");
        Binary binary2 = new Binary("11");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("1111"));
    }

    @Test
    public void testMultiplyByZero() {
        Binary binary1 = new Binary("101");
        Binary binary2 = new Binary("0");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("0"));
    }

    @Test
    public void testMultiplyWithOne() {
        Binary binary1 = new Binary("101");
        Binary binary2 = new Binary("1");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("101"));
    }
}
