package Cau2;

public class Square extends Rectangle{
    private double side;
    /**
     * Constructor
     */
    public Square() {
       super();
    }
    public Square(double side) {
        super(side, side);
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
         this.side = side;
    }
    /**
     * Getter and Setter side 
     */
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    } 
    /**
     * Set width and length
     * @param side 
     */
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
