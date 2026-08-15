// 37.	Fibonacci nth term

package Math;

import java.util.Scanner;

public class Math_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Enter the nth term: ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 1; i <= num; i++){
            if(n == i){
                System.out.println("nth term is: "+a);
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
