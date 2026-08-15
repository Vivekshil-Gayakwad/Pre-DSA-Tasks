// 17.	Check perfect number

package Math;

import java.util.Scanner;

public class Math_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int Perfect = perfectNumber(num);
        if(Perfect == num){
            System.out.println("Number is Perfect.");
        }
        else{
            System.out.println("Number is not Perfect.");
        }
    }

    public static int perfectNumber(int num){
        int perfect = 0;
        int i = 1;
        while(i < num){
            if(num % i == 0){
                perfect += i;
            }
            i++;
        }
        return perfect;
    }


}
