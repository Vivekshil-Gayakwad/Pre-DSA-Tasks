// 1.	Create a calculator using switch.
//2.	Print the day of the week based on a number.

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int a = input.nextInt();
        System.out.print("Enter the num2: ");
        int b = input.nextInt();

        System.out.println("1.Sum\n2.difference\n3.product\n4.quotient");
        System.out.print("Enter the option: ");
        int option = input.nextInt();

        switch(option){
            case 1:
                System.out.println("Sum: "+(a+b));
                break;
            case 2:
                System.out.println("Difference: "+(a-b));
                break;
            case 3:
                System.out.println("Product: "+(a*b));
                break;
            case 4:
                System.out.println("Quotient: "+(a/b));
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
