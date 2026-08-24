package Patterns;

import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = input.nextInt();
        int start = 1;
        for(int i = 0; i < num; i++){
            for(int j = start ; j <= start + i; j++){
                int bit = j % 2;
                System.out.print(bit+" ");
            }
            start++;
            System.out.println();
        }
    }
}
