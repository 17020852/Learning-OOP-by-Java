/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06_7;

import java.awt.Point;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author pc
 */
public class ShapeNGTest {
    
    public ShapeNGTest() {
    }

    /**
     * Test of erase method, of class Shape.
     */
    @Test
    public void testErase() {
        System.out.println("erase");
        Shape instance = new Shape();
        instance.erase();
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class Shape.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Shape instance = new Shape();
        instance.draw();
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Shape.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Shape instance = new Shape();
        String expResult = "";
        String result = instance.getColor();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Shape.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "";
        Shape instance = new Shape();
        instance.setColor(color);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoint method, of class Shape.
     */
    @Test
    public void testGetPoint() {
        System.out.println("getPoint");
        Shape instance = new Shape();
        Point expResult = null;
        Point result = instance.getPoint();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPoint method, of class Shape.
     */
    @Test
    public void testSetPoint() {
        System.out.println("setPoint");
        int x = 0;
        int y = 0;
        Shape instance = new Shape();
        instance.setPoint(x, y);
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFilled method, of class Shape.
     */
    @Test
    public void testIsFilled() {
        System.out.println("isFilled");
        Shape instance = new Shape();
        boolean expResult = false;
        boolean result = instance.isFilled();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilled method, of class Shape.
     */
    @Test
    public void testSetFilled() {
        System.out.println("setFilled");
        boolean filled = false;
        Shape instance = new Shape();
        instance.setFilled(filled);
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Shape.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int x = 0;
        int y = 0;
        Shape instance = new Shape();
        instance.move(x, y);
        fail("The test case is a prototype.");
    }
    
}
