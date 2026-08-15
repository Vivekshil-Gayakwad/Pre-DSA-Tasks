//1.	Handle division by zero.
//2.	Handle invalid array index access.

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter the num2: ");
        int num2 = input.nextInt();

        try{
            int quotient = num1/num2;
            System.out.println("Quotient: "+quotient);
        }
        catch (ArithmeticException e){
            System.out.println("You can not do division by zero");
        }

        int[] array = Array.arrayInput(5);
        System.out.print("Enter the index of element: ");
        int i = input.nextInt();
        try{
                System.out.println(array[i]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}
