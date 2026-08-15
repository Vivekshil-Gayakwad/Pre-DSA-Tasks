package Collection;// 1.	Store and print 10 integers.
//2.	Remove duplicate elements from an ArrayLi

import java.util.ArrayList;

import java.util.Scanner;

public class arrayList{
    public static void main(String[] args) {
        ArrayList<Integer> AL = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num = input.nextInt();
            AL.add(num);
        }

        for(int el : AL){
            System.out.println(el);
        }

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (Integer integer : AL) {
            if (!uniqueList.contains(integer)) {
                uniqueList.add(integer);
            }
        }
        System.out.println("unique list");
        for (int el : uniqueList) {
            System.out.println(el);
        }
    }

}
