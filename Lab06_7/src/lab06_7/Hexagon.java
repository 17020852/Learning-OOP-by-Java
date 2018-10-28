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
public class Hexagon extends Shape{
    private int size;

    public Hexagon(int size, String color, boolean filled, int x, int y) {
        super(color, filled, x, y);
        this.size = size;
    }

    

    public Hexagon() {

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "size=" + size +
                '}';
    }

    @Override
    public void erase(){
        System.out.println("Erase Hexagon at (" + getPoint().getX()+", " + getPoint().getY()+")");
    }

    @Override
    public void draw(){
        System.out.println("Draw Hexagon at (" + getPoint().getX()+", " + getPoint().getY()+")");
    }
    
}
