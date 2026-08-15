// 16.	Check Armstrong number

package Math;

import java.util.Scanner;

public class Math_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int Armstrong = armstrongNumber(num);
        if(Armstrong == num){
            System.out.println("Number is Armstrong.");
        }
        else{
            System.out.println("Number is not Armstrong.");
        }
    }

    public static int armstrongNumber(int num){
        int count = Math_1.countDigit(num);
        int sum = 0;
        while(num>0){
            int digit = num % 10;
            sum += (int)(Math.pow(digit,count));
            num = num/10;
        }
        return sum;
    }
}
