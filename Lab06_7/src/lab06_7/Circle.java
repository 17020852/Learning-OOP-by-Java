/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06_7;

/**
 *
 * @author Linhht-uet
 */
public class Circle extends Shape{
    private double radius ; // ban kinh
    private final double PI = Math.PI;

    public Circle(double radius, String color, boolean filled, int x, int y) {
        super(color, filled, x, y);
        this.radius = radius;
    }

    public Circle() {
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    
    @Override
     public void erase(){
        System.out.println("Erase Circle at (" + getPoint().getX()+", " + getPoint().getY()+")");
    }

    @Override
    public void draw(){
        System.out.println("Draw Circle at (" + getPoint().getX()+", " + getPoint().getY()+")");
    }
}
