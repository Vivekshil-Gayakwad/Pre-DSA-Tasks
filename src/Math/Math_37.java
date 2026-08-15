package Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Math_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Decimal number: ");
        int num = input.nextInt();

        ArrayList<Character> AL = new ArrayList<>();
        String hex = "0123456789ABCDEF";
        while(num > 0){
            int bit = num % 16;
            AL.add(hex.charAt(bit));
            num = num / 16;
        }

        Collections.reverse(AL);

        System.out.print("Hexadecimal Number: ");
        for(Character i : AL){
            System.out.print(i);
        }
    }
}
