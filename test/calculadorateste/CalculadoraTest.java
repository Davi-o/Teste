package calculadorateste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Davi Alves
 */
import Model.Calculadora;

public class CalculadoraTest {

    public CalculadoraTest() {
    }
    /**
     * @return the instance of class calculadora
     */
    public Calculadora instanceOfCalculadora() {
        Calculadora calc = new Calculadora();
        return calc;
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of somar method, of class Calculadora.
     */
    @Test
    public void testSomar() {
        Calculadora calc = instanceOfCalculadora();
        int n1 = 1;
        int n2 = 1;
        double result = calc.somar(n1, n2);
        double expected = 2;
        assertEquals(expected, result, 0.0);
    }

    /**
     * Test of subtrair method, of class Calculadora.
     */
    @Test
    public void testSubtrair() {
        Calculadora calc = instanceOfCalculadora();
        int n1 = 1;
        int n2 = 1;
        double result = calc.subtrair(n1, n2);
        double expected = 0;
        assertEquals(expected, result, 0.0);
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        Calculadora calc = instanceOfCalculadora();
        int n1 = 1;
        int n2 = 1;
        double result = calc.multiplicar(n1, n2);
        double expected = 1;
        assertEquals(expected, result, 0.0);
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        Calculadora calc = instanceOfCalculadora();
        int n1 = 1;
        int n2 = 1;
        double result = calc.dividir(n1, n2);
        double expected = 1;
        assertEquals(expected, result, 0.0);
    }

}
