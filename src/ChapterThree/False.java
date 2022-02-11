package ChapterThree;

import ChapterTwo.Ifelse;

import java.util.Scanner;

public class False {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter FirstNumber");
        int firstNumber = input.nextInt();

        System.out.println("Enter SecondNumber");
        int secondNumber = input.nextInt();

        if (firstNumber%2==0) {
            System.out.println(firstNumber+ "is an even number");
        }
            else{
                System.out.println(firstNumber+ "is an odd number");
            }

            if (secondNumber%2==0) {
                System.out.println(secondNumber + "is an even number");
            }
            else {
                        System.out.println(secondNumber+"is an odd number");
                    }
                }


            }





