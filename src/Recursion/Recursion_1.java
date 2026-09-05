package Recursion;

import java.util.Scanner;

public class Recursion_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Enter name: ");
        String name = input.next();
        printName(1,num,name);
    }

    public static void printName(int i,int num,String name){
        if(i > num){
            return;
        }
        System.out.println(name);
        printName(i + 1, num, name);

    }
}
