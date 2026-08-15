// 15.	Check palindrome number

package Math;

import java.util.Scanner;

public class Math_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int reverse = Math_4.reverseNumber(num);
        if(reverse == num){
            System.out.println("Number is palindromic.");
        }
        else{
            System.out.println("Number is not palindromic.");
        }
    }
}
