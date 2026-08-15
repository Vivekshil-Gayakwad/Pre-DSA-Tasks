// 35.	Check whether two numbers are coprime

package Math;

import java.util.Scanner;

public class Math_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        boolean isCoprime = isCoprime(num1,num2);
        if(isCoprime){
            System.out.println("Numbers are Co-Prime. ");
        }
        else{
            System.out.println("Numbers are not Co-Prime. ");
        }
    }

    public static boolean isCoprime(int num1, int num2){
        int GCD = Math_22.GCD(num1,num2);
        return GCD == 1;
    }


}
