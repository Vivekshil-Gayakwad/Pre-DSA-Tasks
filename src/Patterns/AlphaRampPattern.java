package Patterns;

import java.util.List;
import java.util.Scanner;

public class AlphaRampPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        List<Character> AL = List.of('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');
        try {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(AL.get(i) + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println();
            System.out.println(e.getMessage());
        }
    }
}
