// 28.	Find prime factors

package Math;

import java.util.Scanner;

public class Math_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        for(int i = 2; i <= num; i++){
            while(num % i == 0){
                System.out.print(i+" ");
                num = num / i;
            }

        }

    }
}
