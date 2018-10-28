/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06_7;

import java.awt.Point;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class ShapeTest {
    
    public ShapeTest() {
    }

    /**
     * Test of erase method, of class Shape.
     */
    @Test
    public void testErase() {
        System.out.println("erase");
        Shape instance = new ShapeImpl();
        instance.erase();
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class Shape.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Shape instance = new ShapeImpl();
        instance.draw();
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Shape.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Shape instance = new ShapeImpl();
        String expResult = "";
        String result = instance.getColor();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Shape.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "";
        Shape instance = new ShapeImpl();
        instance.setColor(color);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoint method, of class Shape.
     */
    @Test
    public void testGetPoint() {
        System.out.println("getPoint");
        Shape instance = new ShapeImpl();
        Point expResult = null;
        Point result = instance.getPoint();
        assertEquals(expResult, result);
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
        Shape instance = new ShapeImpl();
        instance.setPoint(x, y);
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFilled method, of class Shape.
     */
    @Test
    public void testIsFilled() {
        System.out.println("isFilled");
        Shape instance = new ShapeImpl();
        boolean expResult = false;
        boolean result = instance.isFilled();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilled method, of class Shape.
     */
    @Test
    public void testSetFilled() {
        System.out.println("setFilled");
        boolean filled = false;
        Shape instance = new ShapeImpl();
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
        Shape instance = new ShapeImpl();
        instance.move(x, y);
        fail("The test case is a prototype.");
    }

    public class ShapeImpl extends Shape {

        public void erase() {
        }

        public void draw() {
        }
    }
    
}
