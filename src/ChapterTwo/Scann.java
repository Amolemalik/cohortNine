package ChapterTwo;

import java.util.Scanner;

public class Scann {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter FirstNumber");
        int number1 = input.nextInt();

        System.out.println("Enter SecondNumber");
        int number2 = input.nextInt();

        System.out.println("Enter ThirdNumber");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        System.out.printf("sum is %d", sum);
    }
}
