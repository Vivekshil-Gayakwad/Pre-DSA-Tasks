//19.	Check automorphic number

package Math;

import java.util.Scanner;

public class Math_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int square = num * num;
        int lastDigitSquare = square % 10;
        int lastDigitNum = num % 10;
        if(lastDigitNum == lastDigitSquare){
            System.out.println("Number is Automorphic.");
        }
        else{
            System.out.println("Number is not Automorphic.");
        }
    }

}
