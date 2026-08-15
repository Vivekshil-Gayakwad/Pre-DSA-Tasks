// 40.	Sum of Fibonacci numbers

package Math;

import java.util.Scanner;

public class Math_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += a;
            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println("Sum of Fibonacci number: "+sum);
    }
}
