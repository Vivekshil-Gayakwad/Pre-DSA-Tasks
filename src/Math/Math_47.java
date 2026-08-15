// 68.	Find all Armstrong numbers in a range

package Math;

import java.util.Scanner;

public class Math_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Lower limit: ");
        int lower = input.nextInt();
        System.out.print("Enter the Upper limit: ");
        int upper = input.nextInt();
        int sum = 0;
        for(int i = lower; i <= upper; i++){
            int temp = i;
            int armstrong = 0;
            while(temp > 0){
                int digit = temp % 10;
                armstrong = armstrong + (int)Math.pow(digit,Math_1.countDigit(i));
                temp /= 10;
            }
            if(i == armstrong){
                System.out.println(i);
                sum += armstrong;
            }
        }
        System.out.println("Sum of Armstrong Number: "+sum);
    }
}
