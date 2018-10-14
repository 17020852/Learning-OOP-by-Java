package Cau2;

public class Circle extends Shape {
    private double radius = 1.0;
    private final double PI = 3.14;
    
    /**
    * Constructor
    */
    public Circle() {
        super();
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    
    /**
    * Setter radius
     * @param radius
    */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Getter radius
     * @return 
     */
    public double getRadius() {
        return radius;
    }
    /**
     * Method getArea
     * @return 
     */
    public double getArea() {
        return (radius *  radius * PI);
    }
    /**
     * Method getPerimeter
     * @return 
     */
    public double getPerimeter() {
        return (2 * radius * PI);
    }
    /**
     * method toString
     * @return 
     */
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + ", filled=" + filled + '}';
    }

}
