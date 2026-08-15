// 74. Find number of digits using logarithm

package Math;

import java.util.Scanner;

public class Math_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int digits;
        if (num == 0) {
            digits = 1;
        } else {
            num = Math.abs(num);
            digits = (int) Math.log10(num) + 1;
        }

        System.out.println("Number of digits: " + digits);
    }
}
