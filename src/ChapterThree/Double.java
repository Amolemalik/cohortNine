package ChapterThree;
import java.math.*;
import java.util.Scanner;

public class Double {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter FirstNumber");
        double FirstNumber = input.nextDouble();

        System.out.println("Enter SecondNumber");
        double SecondNumber = input.nextDouble();

        double Result = FirstNumber + SecondNumber;
        double sqr = Math.sqrt(Result);
        System.out.println(sqr);

    }
}
