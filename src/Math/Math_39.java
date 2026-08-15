package Math;

import java.util.Scanner;

public class Math_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int x = (int)(Math.log(num) / Math.log(2));
        System.out.println("X: "+x);
    }
}
