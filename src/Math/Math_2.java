package Math;// 12.	Sum of digits

import java.util.Scanner;

public class Math_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int sum = sumDigit(num);
        System.out.println("Sum of digit: "+sum);
    }

    public static int sumDigit(int num){
        int sum = 0;
        while(num>0){
            int digit = num % 10;
            sum += digit;
            num = num/10;
        }
        return sum;
    }
}
