package Recursion;

import java.util.Scanner;

public class Recursion_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int sum1 = printSum1(num,0);
        System.out.println("Parameterized:");
        System.out.println("Sum: "+sum1);
        int sum2 = printSum2(num);
        System.out.println("Functional:");
        System.out.println("Sum: "+sum2);
    }

    public static int  printSum1(int i, int sum){
        if(i < 1){
            return sum;
        }
        return printSum1(i - 1, sum + i);
    }

    public static int  printSum2(int num){
        if(num == 0){
            return 0;
        }
        return num + printSum2(num - 1);
    }
}
