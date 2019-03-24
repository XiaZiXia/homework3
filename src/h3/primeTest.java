package h3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class primeTest {
	
	h3 t = new h3();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testPrintPrimes() {
    	String str=new String("Prime: 2\r\nPrime: 3\r\nPrime: 5\r\nPrime: 7\r\nPrime: 11\r\n");
        t.printPrimes(5);
        assertEquals(str,t.Getstr());
    }

}
