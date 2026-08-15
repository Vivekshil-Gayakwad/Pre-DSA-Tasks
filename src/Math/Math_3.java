package Math;

import java.util.Scanner;

public class Math_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int product = productDigit(num);
        System.out.println("Product of digit: "+product);
    }

    public static int productDigit(int num){
        int product = 1;
        while(num>0){
            int digit = num % 10;
            product *= digit;
            num = num/10;
        }
        return product;
    }
}
