/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06_7;

/**
 *
 * @author linhht-uet
 */
public class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle(double width, double length, int x, int y,String color, boolean filled) {
        super(color, filled, x, y);
        this.width = width;
        this.length = length;
       
    }
    @Override
    public void draw() {
        System.out.println("Draw Rectangle at (" + getPoint().getX()+", " + getPoint().getY()+")");
    }
    @Override
    public void erase(){
        System.out.println("Erase Rectangle at (" + getPoint().getX()+", " + getPoint().getY()+")");
    }

    public Rectangle() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    
    
    
    
    
}
