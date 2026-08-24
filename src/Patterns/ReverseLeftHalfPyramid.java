package Patterns;

import java.util.Scanner;

public class ReverseLeftHalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        for(int i = 0; i < num; i++){
            for(int j = i; j >= 1; j--){
                System.out.print("  ");
            }
            for(int j = 1; j <= num - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
