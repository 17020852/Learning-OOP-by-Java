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
     * Getter width
     * @return 
     */
    public double getWith() {
        return width;
    }
    /**
     * Setter Width
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * Getter Length
     * @return 
     */
    public double getLength() {
        return length;
    }
    /**
     * Setter Length
     * @param length
     */
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

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled + '}';
    }
    /**
     * Method toString
     */
    
}
