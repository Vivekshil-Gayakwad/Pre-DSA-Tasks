package Patterns;

import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num - i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            if(i > 1){
                for(int j = 1; j <= i - 1; j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
