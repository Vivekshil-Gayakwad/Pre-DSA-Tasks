package Patterns;

import java.util.Scanner;

public class HallowSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            if(i == 1 || i == num){
                for(int j = 1; j <= num; j++){
                    System.out.print("*  ");
                }
            }
            else{
                for(int j = 1; j <= num; j++){
                    if(j == 1 || j == num){
                        System.out.print("*  ");
                    }
                    else{
                        System.out.print("   ");
                    }

                }
            }
            System.out.println();
        }
    }
}
