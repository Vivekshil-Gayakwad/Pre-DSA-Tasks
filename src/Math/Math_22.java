// 32.	Find GCD/HCF of two numbers

package Math;

import java.util.Scanner;

public class Math_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int GCD = GCD(num1,num2);
        System.out.println("GCD: "+GCD);
    }

    public static int GCD(int num1, int num2){
        if(num1 > num2){
            for(int i = num1; i > 0; i--){
                if((num1 % i == 0) && (num2 % i == 0)){
                    return i;
                }
            }
        } else if (num1 < num2) {
            for(int i = num2; i > 0; i--){
                if((num1 % i == 0) && (num2 % i == 0)){
                    return i;
                }
            }
        }
        else{
            return num1;
        }
        return 0;
    }
}
