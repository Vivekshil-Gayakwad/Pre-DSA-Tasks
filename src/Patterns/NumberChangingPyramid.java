package Patterns;

import java.util.Scanner;

public class NumberChangingPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = input.nextInt();
        int start = 0;
        for(int i = 0; i < num; i++){
            start += i;
            for(int j = start + 1; j <= start + i + 1; j++){
                System.out.print(j+"   ");
            }
            System.out.println();
        }
    }
}
