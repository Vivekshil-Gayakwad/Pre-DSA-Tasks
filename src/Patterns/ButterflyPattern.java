package Patterns;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            for(int j = 1; j <= num - i; j++){
                System.out.print("    ");
            }

            for(int j = 1; j <= i ; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num - i; j++){
                System.out.print("* ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("    ");
            }

            for(int j = 1; j <= num - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
