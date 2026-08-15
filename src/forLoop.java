//1.	Print numbers from 1 to 100.
//2.	Print the multiplication table of a number.

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = input.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }

    }
}
