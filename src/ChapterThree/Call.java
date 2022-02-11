package ChapterThree;

import java.util.Scanner;

public class Call {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("what is your favourite food");
        String food = input.nextLine();

        System.out.println("what is your name");
        String name = input.nextLine();

        System.out.println("how old are you");
        int age = input.nextInt();

        System.out.println("your favourite food is" +food);
        System.out.println("your name is" +name);
        System.out.println("your age is "+age);






    }
}
