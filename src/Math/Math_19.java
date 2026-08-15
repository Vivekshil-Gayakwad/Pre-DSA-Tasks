// 29.	Find all factors of a number

package Math;

import java.util.Scanner;

public class Math_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
