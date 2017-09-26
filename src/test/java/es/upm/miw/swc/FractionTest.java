package es.upm.miw.swc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction fraction;

    @Before
    public void before() {
        fraction = new Fraction(1, 2);
    }

    @Test
    public void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(1, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(0.5, fraction.decimal(), 10e-5);
    }
    
    @Test
    public void testisMayor() {
        Fraction obj = new Fraction(2,2);
        assertEquals(true,fraction.isMayor(obj));
    }
}
