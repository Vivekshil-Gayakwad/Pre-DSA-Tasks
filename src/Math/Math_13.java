// 23.	Remove a digit from a number

package Math;

import java.util.Scanner;

public class Math_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Enter number to remove: ");
        int remove = input.nextInt();
        if(checkDigit(num,remove)){
            int removedDigit = removedDigit(num,remove);
            System.out.println("Number: "+removedDigit);
        }
        else{
            System.out.println("Digit is not present");
        }
    }

    public static int removedDigit(int num, int remove){
        int result = 0;
        int place = 1;
        while(num > 0){
            int digit = num % 10;
            if(digit != remove){
                result = result + digit * place;
                place = place * 10;
            }

            num = num / 10;
        }

        return result;
    }

    public static boolean checkDigit(int num,int check){
        boolean isPresent = false;
        while(num > 0){
            int digit = num % 10;
            if (digit == check) {
                isPresent = true;
                break;
            }
            num = num / 10;
        }
        return isPresent;
    }
}
