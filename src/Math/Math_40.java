// 61.	Find the second-largest digit in a number

package Math;

import java.util.Scanner;

public class Math_40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int largest = -1;
        int secondlargest = -1;
        while(num > 0){
            int digit = num % 10;
            if(digit > largest){
                secondlargest = largest;
                largest = digit;
            }
            else if(digit > secondlargest && digit != largest){
                secondlargest = digit;
            }

            num = num / 10;
        }
        if(secondlargest == -1){
            System.out.println("does not has second largest number !");
        }
        else{
            System.out.println("Second largest number: "+secondlargest);
        }
    }
}
