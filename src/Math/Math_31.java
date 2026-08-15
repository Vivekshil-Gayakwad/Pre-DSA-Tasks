// 41.	Pascal's triangle

package Math;

import java.util.Scanner;

public class Math_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {

            for (int space = 0; space < num - i - 1; space++) {
                System.out.print(" ");
            }

            int value = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");

                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
