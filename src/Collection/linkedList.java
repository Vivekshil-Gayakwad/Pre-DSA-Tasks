package Collection;//1.	Insert elements at the beginning and end.
//2.	Reverse a LinkedList.

import java.util.LinkedList;
import java.util.Scanner;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        for(int i = 1; i <= 8; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num = input.nextInt();
            LL.add(num);
        }
        LL.addFirst(0);
        LL.addLast(10);
        for(int el: LL){
            System.out.println(el);
        }

        LinkedList<Integer> reverseList = new LinkedList<>();
        for(int i = LL.size()-1; i >= 0; i--){
            reverseList.add(LL.get(i));
        }
        System.out.println("Reverse List");
        for(int el: reverseList){
            System.out.println(el);
        }
    }
}
