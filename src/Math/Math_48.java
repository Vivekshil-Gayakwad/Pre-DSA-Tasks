// 69.	Find all perfect numbers in a range

package Math;

import java.util.Scanner;

public class Math_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Lower limit: ");
        int lower = input.nextInt();
        System.out.print("Enter the Upper limit: ");
        int upper = input.nextInt();
        for(int i = lower; i <= upper; i++){
            int perfect = 0;
            for(int j = 1; j < i; j++){
                if(i % j == 0){
                    perfect += j;
                }
            }
            if(i == perfect){
                System.out.println(i);
            }
        }
    }
}
