package Patterns;

import java.util.Scanner;

public class HallowTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num - i; j++){
                System.out.print("  ");
            }

            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i || i == num){
                    System.out.print("*   ");
                }
                else{
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}
