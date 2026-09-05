package Recursion;

import java.util.Scanner;

public class Recursion_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        printNum(1,num);
    }

    public static void printNum(int i,int num){
        if(i > num){
            return;
        }
        System.out.println(i);
        printNum(i + 1, num);

    }
}
