
package lab06_7;

import java.awt.Point;

/**
 *
 * @author linhht-uet
 */
public abstract class Shape{
    private String color;
    private boolean filled;
    private Point point;

    public Shape(String color, boolean filled, int x, int y) {
        this.color = color;
        this.filled = filled;
        this.point = new Point(x, y);
    }

    public Shape() {
    }
    
    //xoa hinh
    abstract public void erase() ;
    
    //ve hinh

    abstract public void draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(int x, int y) {
        this.point = new Point(x,y);
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public void move(int x, int y) {
        Point point1 = new Point(x,y);
        this.erase();
        this.point = point1;
        this.draw();
    }
    
    
}


