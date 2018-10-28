
package lab06_7;

import java.awt.Point;

/**
 *
 * @author Linhht-uet
 */
public class Triangle extends Shape{
    private Point pointA;
    private Point pointB;
    private Point pointC;
    
    //Constructor

    public Triangle(String color, boolean filled, int xA, int yA, int xB, int yB, int xC, int yC) {
        super(color, filled, xA, yA);
        this.pointA = new Point(xA, yA);
        this.pointB = new Point(xB, yB);
        this.pointC = new Point(xC, yC);
    }

    public Triangle() {
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
    
    
    
    
    @Override
    public void erase(){
        System.out.println("Erase Triangle at (" + this.pointA.getX()+", " + this.pointA.getY()+")");
    }

    @Override
    public void draw(){
        System.out.println("Draw Triangle at (" + this.pointA.getX()+", " + this.pointA.getY()+")");
    }
}
