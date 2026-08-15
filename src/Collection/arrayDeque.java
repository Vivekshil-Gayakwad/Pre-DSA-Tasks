package Collection;

import java.util.ArrayDeque;
import java.util.Scanner;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque <Integer> aq = new ArrayDeque<>();
        for(int i = 1; i < 5;i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number:  ");
            int  num = input.nextInt();
            aq.offer(num);
        }
        aq.addFirst(3);
        aq.addLast(9);

        for(int el: aq){
            System.out.print(el+"\t");
        }
    }
}
