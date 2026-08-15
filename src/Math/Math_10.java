// 20.	Check Harshad/Niven number

package Math;

import java.util.Scanner;

public class Math_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int sum = Math_2.sumDigit(num);
        if(num % sum == 0){
            System.out.println("Number is Harshad.");
        }
        else{
            System.out.println("Number is not Harshad.");
        }
    }
}
