package Recursion;

import java.util.Scanner;

public class Recursion_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int fact = printFactorial(num);
        System.out.println("Factorial: "+fact);
    }

    public static int  printFactorial(int num){
        if(num == 0){
            return 1;
        }
        return num * printFactorial(num - 1);
    }
}
