
package lab06_7;

/**
 *
 * @author linhht-uet
 */
public class Square extends Shape{
    private double side;
    //Constructor

    /**
     *
     * @param color
     * @param filled
     * @param x
     * @param y
     * @param side
     */
    public Square(String color, boolean filled, int x, int y, double side) {
        super(color, filled, x, y);
        this.side = side;
    }

    public Square() {
        super();
    }
    
    //Setter and Getter

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    
    
    @Override
     public void erase(){
        System.out.println("Erase Square at (" + getPoint().getX()+", " + getPoint().getY()+")");
    }

    @Override
    public void draw(){
        System.out.println("Draw Square at (" + getPoint().getX()+", " + getPoint().getY()+")");
    }
    
}
