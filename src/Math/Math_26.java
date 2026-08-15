// 36.	Fibonacci series

package Math;

import java.util.Scanner;

public class Math_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int a = 0;
        int b = 1;
        for(int i = 1; i <= num; i++){
            System.out.print(a+" ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
