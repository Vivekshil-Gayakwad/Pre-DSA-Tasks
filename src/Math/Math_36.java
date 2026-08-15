// 50.	Decimal → Octal

package Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Math_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Decimal number: ");
        int num = input.nextInt();
        ArrayList<Integer> AL = new ArrayList<>();
        while(num > 0){
            int bit = num % 8;
            AL.add(bit);
            num = num / 8;
        }

        Collections.reverse(AL);
        System.out.print("Octal Number: ");
        for(int i : AL){
            System.out.print(i);
        }

    }
}
