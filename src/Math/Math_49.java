// 70.	Find the nth prime number

package Math;

import java.util.Scanner;

public class Math_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = input.nextInt();
        System.out.print("Enter the n: ");
        int n = input.nextInt();
        int k = 1;
        for(int i = 2; i <= N; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                if(n == k){
                    System.out.println("nth Prime number is: "+i);
                }
                k++;
            }
        }
    }
}
