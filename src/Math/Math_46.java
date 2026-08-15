// 67.	Find all palindromic numbers in a range

package Math;

import java.util.Scanner;

public class Math_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Lower limit: ");
        int lower = input.nextInt();
        System.out.print("Enter the Upper limit: ");
        int upper = input.nextInt();
        for(int i = lower; i <= upper; i++){
            if(i == Math_4.reverseNumber(i)){
                System.out.println(i);
            }
        }
    }
}
