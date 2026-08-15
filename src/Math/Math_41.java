// 62.	Find the second-smallest digit

package Math;

import java.util.Scanner;

public class Math_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int smallest = 9;
        int secondsmallest = 9;
        while(num > 0){
            int digit = num % 10;
            if(digit < smallest){
                secondsmallest = smallest;
                smallest = digit;
            }
            else if(digit < secondsmallest && digit != smallest){
                secondsmallest = digit;
            }
            num = num / 10;
        }

        System.out.println("Smallest number: "+secondsmallest);
    }
}
