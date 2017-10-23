/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1957;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodrigo
 */
public class Dec2HexTest {
    
    public Dec2HexTest() {
    }

    /**
     * Test of dec2Hex method, of class Dec2Hex.
     */
    @Test
    public void testDec2Hex() {
        System.out.println("dec2Hex input 10");
        int decimal = 10;
        String expResult = "A";
        String result = Dec2Hex.dec2Hex(decimal);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDec2Hex1() {
        System.out.println("dec2Hex input 15");
        int decimal = 15;
        String expResult = "F";
        String result = Dec2Hex.dec2Hex(decimal);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDec2Hex2() {
        System.out.println("dec2Hex input 16");
        int decimal = 16;
        String expResult = "10";
        String result = Dec2Hex.dec2Hex(decimal);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDec2Hex3() {
        System.out.println("dec2Hex input 31");
        int decimal = 31;
        String expResult = "1F";
        String result = Dec2Hex.dec2Hex(decimal);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDec2Hex4() {
        System.out.println("dec2Hex input 65535");
        int decimal = 65535;
        String expResult = "FFFF";
        String result = Dec2Hex.dec2Hex(decimal);
        assertEquals(expResult, result);
    }
    
}
