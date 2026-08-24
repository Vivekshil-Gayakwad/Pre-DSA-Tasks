package Patterns;

import java.util.Scanner;

public class ReverseRightHalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        for(int i = 0; i < num; i++){
            for(int j = num - i ; j >= 1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
