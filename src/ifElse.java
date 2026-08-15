//1.	Check whether a number is positive or negative.
//2.	Check whether a person is eligible to vote.
//1.	Find the largest of two numbers.
//2.	Check whether a number is divisible by 5.

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 = input.nextInt();

        if(num1>0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative");
        }

        System.out.print("Enter the age: ");
        int age = input.nextInt();

        if(age>18){
            System.out.println("The person is eligible for vote");
        }
        else{
            System.out.println("The person is not eligible for vote");
        }

        System.out.print("Enter the num1: ");
        int a = input.nextInt();
        System.out.print("Enter the num1: ");
        int b = input.nextInt();

        if(a>b){
            System.out.println("Num1 is greater.");
        }
        else{
            System.out.println("Num2 is greater.");
        }

        if(num1%5==0){
            System.out.println("Num1 is divisible by 5.");
        }
        else{
            System.out.println("Num1 is not divisible by 5.");
        }

    }
}
