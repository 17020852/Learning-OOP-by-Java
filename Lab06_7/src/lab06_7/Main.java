
package lab06_7;

/**
 *
 * @author linht-uet
 */
public class Main {
    public static void main(String[] args) {
        Diagram diagram = new Diagram(2);
    Layer layer = new Layer(5);
    
    Circle circle = new Circle(3, "blue", true, 3, 3);
    Square square = new Square("green", true, 10, 10, 4);
    Rectangle rectangle = new Rectangle(4, 3, 20,20 , "yellow", true);
    Triangle triangle = new Triangle("pink", true, 4, 3, 10, 10, 5, 6);
    Hexagon hexagon = new Hexagon(6, "red", true, 30, 30);
    
    circle.move(0, 0);
    square.move(10, 20);
    

    layer.getLayer().add(circle);
    layer.getLayer().add(square);
    layer.getLayer().add(rectangle);
    layer.getLayer().add(triangle);
    layer.getLayer().add(hexagon);
    
    layer.drawallshape();
    diagram.getDiagram().add(layer);
    
    
    layer.removeTriangle();
    diagram.removeAllCircles();
    diagram.removeSameShape();
    
    System.out.println();
    diagram.drawLayervisiable();
    Diagram diagram1 = diagram.phanloaihinh();
    for (Layer layer2 : diagram1.getDiagram()){
            System.out.println(layer2.getLayer().size());
        }
    }
    
}
