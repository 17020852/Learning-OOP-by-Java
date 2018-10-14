package Cau2;

public class Square extends Rectangle{
    double side;
    /**
     * Constructor
     */
    public Square() {
       super();
    }
    public Square(double side) {
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    /**
     * Getter side
     * @return 
     */
    public double getSide() {
        return side;
    }
    /**
     * Setter side
     * @param side
     */
    
    public void setSide(double side) {
        this.side = side;
    } 
    @Override
    public void setWidth(double side) {
        this.setWidth(side);
    }
    @Override
    public void setLength(double side) {
        this.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + ", color=" + color + ", filled=" + filled +'}';
    }
    
    
    
}
