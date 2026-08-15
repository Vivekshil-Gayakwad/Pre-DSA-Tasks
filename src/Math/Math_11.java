package Math;

import java.util.Scanner;

public class Math_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int last = num % 10;
        int reverse = Math_4.reverseNumber(num);
        int first = reverse % 10;
        System.out.println("First Digit: "+first+"\nLast Digit: "+last);
    }
}
