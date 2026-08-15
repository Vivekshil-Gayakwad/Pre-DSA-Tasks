// 33.	Find LCM of two numbers

package Math;

import java.util.Scanner;

public class Math_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int LCM = LCM(num1,num2);
        System.out.println("LCM: "+LCM);
    }

    public static int LCM(int num1, int num2){
        int i = 1;
        while(true){
            if((i % num1 == 0) && (i % num2 == 0)){
                return i;
            }
            i++;
        }
    }
}
