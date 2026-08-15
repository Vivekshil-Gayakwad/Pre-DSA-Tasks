// 1.	Print numbers from 1 to 10.
//2.	Create a menu-driven calculator using do-while.

import java.util.Scanner;

public class doLoop {
    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int a = input.nextInt();
        System.out.print("Enter the num2: ");
        int b = input.nextInt();

        System.out.println("1.Sum\n2.difference\n3.product\n4.quotient\n5.exit");
        int option;
        do {
            System.out.print("Enter the option: ");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Sum: " + (a + b));
                    break;
                case 2:
                    System.out.println("Difference: " + (a - b));
                    break;
                case 3:
                    System.out.println("Product: " + (a * b));
                    break;
                case 4:
                    System.out.println("Quotient: " + (a / b));
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }while(option != 5);
    }
}
