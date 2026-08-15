// 38.	Arithmetic progression

package Math;

import java.util.Scanner;

public class Math_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int lower = input.nextInt();
        System.out.print("Enter the upper limit: ");
        int upper = input.nextInt();
        System.out.print("Enter the difference: ");
        int diff = input.nextInt();
        printAP(lower,upper,diff);
    }

    public static void printAP(int lower, int upper, int diff) {
        while (lower <= upper) {
            System.out.println(lower);
            lower += diff;
        }
    }
}
