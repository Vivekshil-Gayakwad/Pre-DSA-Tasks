package Collection;//1.	Remove duplicates from an array.
//2.	Find the union of two sets.

import java.util.HashSet;
import java.util.Scanner;

public class hashSet {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i < 10; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num = input.nextInt();
            array[i] = num;
        }
        System.out.println("original array");
        for(int el: array){
            System.out.print(el+"\t");
        }
        System.out.println();
        HashSet<Integer> set1 = new HashSet<>();
        for(int el: array){
            set1.add(el);
        }
        System.out.println("first set");
        for(int el: set1){
            System.out.print(el+"\t");
        }

        System.out.println();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0; i < 10; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num = input.nextInt();
            set2.add(num);
        }

        System.out.println("second set");
        for(int el: set2){
            System.out.print(el+"\t");
        }
        System.out.println();
        System.out.println("union set");
        set1.addAll(set2);
        for(int el: set1){
            System.out.print(el+"\t");
        }
    }

}
