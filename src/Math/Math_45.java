// 66.	Find the sum of prime digits

package Math;

import java.util.Scanner;

public class Math_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int sum = 0;
        while(num > 0){
            boolean isPrime = true;
            int digit = num % 10;
            if(digit > 1){
                for(int i = 2; i < digit; i++){
                    if(digit % i == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    sum += digit;
                }
            }
            num = num / 10;
        }
        System.out.println("Sum of Prime Digit: "+sum);
    }
}
