
package Cau2;


public class Shape {
    String color = "red";
    boolean filled = true;
    
    /**
     * Constructor
     */
    public Shape() {
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    /**
     * Getter and Getter
     */
     public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }
    
    /**
     * method toString
     * @return 
     */ 
    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }
   
    
}
