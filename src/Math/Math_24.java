// 34.	Find GCD of multiple numbers

package Math;

import java.util.Scanner;

public class Math_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        int GCD = GCD(num1,num2,num3);
        System.out.println("GCD: "+GCD);
    }

    public static int GCD(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3){
            for(int i = num1; i > 0; i--){
                if((num1 % i == 0) && (num2 % i == 0)){
                    return i;
                }
            }
        } else if (num2 > num3) {
            for(int i = num2; i > 0; i--){
                if((num1 % i == 0) && (num2 % i == 0)){
                    return i;
                }
            }
        }
        else{
            for(int i = num2; i > 0; i--){
                if((num1 % i == 0) && (num2 % i == 0)){
                    return i;
                }
            }
        }
        return num1;
    }
}
