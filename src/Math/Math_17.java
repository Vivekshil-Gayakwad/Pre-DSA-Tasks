// 27.	Count primes from 1 to N

package Math;

import java.util.Scanner;

public class Math_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = input.nextInt();
        int count = 0;
        for(int i = 2; i <= N; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }
        System.out.println("Count of Prime number from "+1+" to "+N+" is: "+count);
    }
}
