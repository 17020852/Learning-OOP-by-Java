import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Week4 {
    public static void main(String[] args) throws FileNotFoundException{
        //cau 1
        Random random = new Random();
        int mark = random.nextInt(100);
        int count = 0;
        boolean check = false;
        while (count <10 && !check) {
            int guess;
            System.out.println("Enter a number:");
            Scanner scanner = new Scanner(System.in);
            guess = scanner.nextInt();
            if (guess == mark) {
                System.out.println("Correct!");
                check = true;
            }
            else if (guess<mark){
                if (count <9) {
                    System.out.println("Too low! Try again!");
                }

            }
            else {
                if (count<9) {
                    System.out.println("Too high! Try again!");
                }
            }
            count++;

        }
        if ( count == 10) {
            System.out.println("You lose!\n The correct number is: " +mark +"\n" );
        }
        //Cau 2
        int count2 =0;
        File file = new File("lab04.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            scanner.next();
            count2++;

        }
        System.out.println("So tu trong file la: " + count2);

    }
}
