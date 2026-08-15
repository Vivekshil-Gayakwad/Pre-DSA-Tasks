// 64.	Find the difference between largest and smallest digit

package Math;

import java.util.Scanner;

public class Math_43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int largest = -1;
        int smallest = 9;
        while(num > 0){
            int digit = num % 10;
            if(digit > largest){
                largest = digit;
            }
            if(digit < smallest){
                smallest = digit;
            }

            num = num / 10;
        }

        System.out.println("Largest digit: "+largest);
        System.out.println("Smallest digit: "+smallest);
        System.out.println("Difference between Largest And Smallest: "+(largest - smallest));
    }
}
