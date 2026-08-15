//1.	Find the sum, difference, product, and quotient of two numbers.
//2.	Check whether a number is even or odd.

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second Number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum: "+sum);

        int dif = num1 - num2;
        System.out.println("Difference: "+dif);

        int product = num1*num2;
        System.out.println("Product: "+product);

        int quotient = num1 / num2;
        System.out.println("Quotient: "+quotient);

        if(num1 % 2 == 0){
            System.out.printf("%d is Even number",num1);
        }
        else{
            System.out.printf("%d is Odd number",num1);
        }
    }
}
