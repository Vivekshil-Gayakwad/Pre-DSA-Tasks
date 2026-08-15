package Collection;

import java.util.PriorityQueue;
import java.util.Scanner;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 1; i < 5;i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number:  ");
            int  num = input.nextInt();
            pq.offer(num);
        }

        for(int el: pq){
            System.out.print(el+"\t");
        }
    }
}
