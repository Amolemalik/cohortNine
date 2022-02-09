package ChapterTwo;

import java.util.Scanner;

public class Statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int number1 = input.nextInt();

        System.out.println("predecessor"+ number1);
        System.out.println("Successor"+ number1);
    }
}
