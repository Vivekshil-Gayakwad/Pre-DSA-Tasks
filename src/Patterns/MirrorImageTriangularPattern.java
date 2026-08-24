package Patterns;

import java.util.Scanner;

public class MirrorImageTriangularPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int j = i; j <= num; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for(int i = num - 1; i >= 1; i--){
            for(int j = num - i; j <= num - 2; j++){
                System.out.print(" ");
            }

            for(int j = i; j <= num; j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
