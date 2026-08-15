// 14.	Reverse a number
package Math;

import java.util.Scanner;

public class Math_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int reverse = reverseNumber(num);
        System.out.println("Reverse of number: "+reverse);
    }

    public static int reverseNumber(int num){
        int count = Math_1.countDigit(num);
        int temp = count - 1;
        int reverse = 0;
        while(num>0){
            int digit = num % 10;
            reverse += digit*(int)(Math.pow(10,temp));
            num = num/10;
            temp--;
        }
        return reverse;
    }
}
