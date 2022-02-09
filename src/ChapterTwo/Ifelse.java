package ChapterTwo;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Enter a number: ");
         number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + "is an even Number");
        } else {
                System.out.println(number + "is an odd Number");
            }

    }
}
