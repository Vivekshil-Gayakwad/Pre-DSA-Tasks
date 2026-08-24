package Patterns;

import java.util.List;
import java.util.Scanner;

public class AlphaTrianglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        List<Character> AL = List.of('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');
        try {
            for (int i = num - 1; i >= 0; i--) {
                for (int j = i; j <= num - 1; j++) {
                    System.out.print(AL.get(j) + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println();
            System.out.println(e.getMessage());
        }
    }
}
