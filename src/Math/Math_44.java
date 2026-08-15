// 65.	Count even/odd digits

package Math;

import java.util.Scanner;

public class Math_44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int countEven = 0;
        int countOdd = 0;
        while(num > 0){
            int digit = num % 10;
            if(digit % 2 == 0){
                countEven++;
            }
            else{
                countOdd++;
            }
            num = num / 10;
        }
        System.out.println("Count of Even Digit: "+countEven);
        System.out.println("Count of Odd Digit: "+countOdd);
    }
}
