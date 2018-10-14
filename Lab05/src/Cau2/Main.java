
package Cau2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        Rectangle rectangle = new Rectangle(3, 4);
        Square square = new Square(5);
        System.out.println(circle.toString());
        System.out.println("Dien tich hinh tron la: " + circle.getArea());
        System.out.println(rectangle.toString());
        System.out.println("Dien tich hinh chu nhat la: " + rectangle.getArea());
        System.out.println(square.toString());
        System.out.println("Dien tich hinh vuong la: " + square.getArea());
    }
   
}
