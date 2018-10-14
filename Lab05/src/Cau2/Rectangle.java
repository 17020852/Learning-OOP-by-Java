package Cau2;

public class Rectangle extends Shape{
    private double width  = 1.0;
    private double length = 1.0;
    
    /**
     * Constructor
     */
    public Rectangle() {
        
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    /**
     * Getter and Setter width
     */
    public double getWith() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * Getter and Setter length
     */
    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    /**
     * Method GetArea
     * @return 
     */
    public double getArea() {
        return width * length;
    }
    /**
     * Method GetPerimetere
     * @return 
     */
    public double getPerimeter() {
        return 2 * (width + length);
    }
    /**
     * Method toString
     * @return 
     */
    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled + '}';
    }
    
}
