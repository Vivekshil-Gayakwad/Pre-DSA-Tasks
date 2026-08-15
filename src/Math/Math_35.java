package Math;

import java.util.Scanner;

public class Math_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Decimal number: ");
        int num = input.nextInt();
        int decimal = 0;
        int i = 0;
        while(num > 0){
            int bit = num % 10;
            decimal = decimal + bit * (int)Math.pow(2,i);
            i++;
            num = num / 10;
        }

        System.out.println("Decimal: "+decimal);
    }
}
