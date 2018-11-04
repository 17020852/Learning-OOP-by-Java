package Task1;

public class ExpressionTest {
    public static void main(String[] args) {
        try {
            Square square = new Square(new Numeral(10));
            Subtraction subtraction = new Subtraction(square, new Numeral(1));
            System.out.println(subtraction.toString() + " = " + subtraction.evaluate());
            
            Multiplication multiplication = new Multiplication(new Numeral(2), new Numeral(3));
            System.out.println(multiplication.toString()+ " = " + multiplication.evaluate());
            Addition addition = new Addition(subtraction, multiplication);
            
            System.out.println(addition.toString()+ " = " + addition.evaluate());
            Square square1 = new Square(addition);
            System.out.println(square1.toString());
            
            Numeral a = new Numeral(0);
            Division division = new Division(square1, a);
            System.out.println(division.toString());
            System.out.println(" = "+ division.evaluate());
            
        } catch (ArithmeticException e) {
            System.out.println("Loi chia cho 0.");
        }
        
    }
}
