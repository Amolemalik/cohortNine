package ChapterTwo;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int sum;

        int firstNumber= input.nextInt();
        System.out.println("Enter another Number");

        int secondNumber = input.nextInt();
        System.out.println("enter another number");

        int thirdNumber = input.nextInt();
        sum = firstNumber + secondNumber + thirdNumber;

        int multiplication;
        multiplication = firstNumber * secondNumber * thirdNumber;

        System.out.printf("the multiplication is %d%n",multiplication);
        System.out.printf("the sum is %d%n",sum);

        int division;
        division = firstNumber / secondNumber;
        System.out.printf("the division is %d%n",division);
    }
}
