package Patterns;

import java.util.Scanner;

public class FullSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
