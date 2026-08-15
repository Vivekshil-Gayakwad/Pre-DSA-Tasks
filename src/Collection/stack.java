package Collection;//1.	Implement a stack using Java's Stack class.
//2.	Check balanced parentheses.

import java.util.Scanner;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        for(int i = 1; i < 5;i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the name:  ");
            String  name = input.next();
            st.push(name);
        }

        for(String el: st){
            System.out.print(el+"\t");
        }
    }

}
