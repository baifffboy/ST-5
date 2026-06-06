package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    private static final double DELTA = 1e-6;
    
    @Test
    public void testSqrtOf4() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), DELTA);
    }
    
    @Test
    public void testSqrtOf9() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.calc(), DELTA);
    }
    
    @Test
    public void testSqrtOf16() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(4.0, sqrt.calc(), DELTA);
    }
    
    @Test
    public void testSqrtOf2() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), DELTA);
    }
    
    @Test
    public void testSqrtOf0() {
        Sqrt sqrt = new Sqrt(0.0);
        double result = sqrt.calc();
        assertTrue(result < 1e-4);
    }
    
    @Test
    public void testSqrtOf1() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.calc(), DELTA);
    }
    
    @Test
    public void testSqrtOf0_25() {
        Sqrt sqrt = new Sqrt(0.25);
        assertEquals(0.5, sqrt.calc(), DELTA);
    }
    
    @Test
    public void testSqrtOf100() {
        Sqrt sqrt = new Sqrt(100.0);
        assertEquals(10.0, sqrt.calc(), DELTA);
    }
    
    @Test
    public void testSqrtOf0_01() {
        Sqrt sqrt = new Sqrt(0.01);
        assertEquals(0.1, sqrt.calc(), DELTA);
    }
    
    @Test
    public void testSqrtOf144() {
        Sqrt sqrt = new Sqrt(144.0);
        assertEquals(12.0, sqrt.calc(), DELTA);
    }
    
    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(6.5, sqrt.average(4.0, 9.0), DELTA);
    }
    
    @Test
    public void testGoodReturnsTrue() {
        Sqrt sqrt = new Sqrt(4.0);
        assertTrue(sqrt.good(2.0, 4.0));
    }
    
    @Test
    public void testGoodReturnsFalse() {
        Sqrt sqrt = new Sqrt(4.0);
        assertFalse(sqrt.good(3.0, 4.0));
    }
    
    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.1666666666666665, sqrt.improve(3.0, 4.0), DELTA);
    }
    
    @Test
    public void testSqrtOf1000000() {
        Sqrt sqrt = new Sqrt(1000000.0);
        assertEquals(1000.0, sqrt.calc(), DELTA);
    }
}
