// 24.	Find frequency of each digit

package Math;

import java.util.Scanner;

public class Math_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Enter digit to get Frequency: ");
        int f = input.nextInt();
        int frequency = frequencyOfDigit(num,f);
        System.out.println("Frequency of Digit is: "+frequency);
    }

    public static int frequencyOfDigit(int num, int d){
        int count = 0;
        while(num > 0){
            int digit = num % 10;
            if(d == digit){
                count++;
            }
            num = num / 10;
        }
        return count;
    }
}
