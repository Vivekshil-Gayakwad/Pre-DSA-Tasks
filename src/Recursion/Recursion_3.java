package Recursion;

import java.util.Scanner;

public class Recursion_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        printReverseNum(1,num);
    }

    public static void printReverseNum(int i,int num){
        if(i > num){
            return;
        }
        System.out.println(num);
        printReverseNum(i, num - 1);

    }
}
