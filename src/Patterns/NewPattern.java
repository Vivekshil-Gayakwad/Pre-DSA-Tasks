package Patterns;

import java.util.Scanner;

public class NewPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        newPattern1(num);
        System.out.println();
        newPattern2(num);
    }

    public static void newPattern1(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num - i; j++){
                System.out.print("  ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }

            if(i >= 2){
                for(int j = i-1; j >= 1; j--){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }

    public static void newPattern2(int num){
        if(num % 2 != 0) {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if ((i == 0 && j == 0) || (i == 0 && j == num - 1) || (i == num - 1 && j == 0) || (i == num - 1 && j == num - 1) || (i == num / 2 && j == num / 2)) {
                        System.out.print("*  ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        else{
            System.out.println("This is not for Even number, Sorry !!");
        }
    }
}
