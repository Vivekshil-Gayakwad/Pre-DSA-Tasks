package Math;

import java.util.Scanner;

public class Math_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = input.nextInt();
        System.out.print("Enter the n: ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 1; i <= N; i++){
            if(n == i){
                System.out.println("nth Fibonacci number: "+a);
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
