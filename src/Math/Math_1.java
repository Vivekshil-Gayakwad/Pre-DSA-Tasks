package Math;// 11.	Count digits of a number

import java.util.Scanner;

public class Math_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int count = countDigit(num);
        System.out.println("count of digit is: "+count);
    }

    public static int countDigit(int num){
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }
}
