// 18.	Check strong number

package Math;

import java.util.Scanner;

public class Math_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int Strong = strongNumber(num);
        if(Strong == num){
            System.out.println("Number is Strong.");
        }
        else{
            System.out.println("Number is not Strong.");
        }
    }

    public static int strongNumber(int num){
        int strong = 0;
        while(num > 0){
            int digit = num % 10;
            int fact = 1;
            for(int j = 1; j <= digit; j++){
                fact *= j;
            }
            strong += fact;
           num = num/10;
        }
        return strong;
    }
}
