//1.	Print numbers from 100 to 1.
//2.	Find the sum of digits of a number.

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        int i = 100;
        while(i >= 1){
            System.out.println(i);
            i--;
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = input.nextInt();
        int sum = 0;
        while(num>0){
            int digit = num % 10;
            sum += digit;
            num = num/10;
        }
        System.out.println("Sum of digit: "+sum);

    }
}
