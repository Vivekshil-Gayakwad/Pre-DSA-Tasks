// 31.	Find sum of factors

package Math;

import java.util.Scanner;

public class Math_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        System.out.println("Sum of Factors: "+sum);
    }
}
