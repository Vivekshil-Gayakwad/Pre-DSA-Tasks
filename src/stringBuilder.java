// 1.	Reverse a string using StringBuilder.
//2.	Append multiple strings and print the result.

import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.next();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reverse String: "+sb.toString());

        StringBuilder sb1 = new StringBuilder(str);
        sb1.append("gayakwad");
        System.out.println("Reverse String: "+sb1.toString());
    }
}
