//1.	Stop printing numbers when the value reaches 50.
//2.	Search an element in an array and stop when found.

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        int i = 1;
        while(true){
            System.out.println(i);
            if(i == 50){
                break;
            }
            i++;
        }

        int[] arr = {1,3,4,5,6,8};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Element: ");
        int el = input.nextInt();
        for(int j = 0; j < arr.length; j++){
            if(el == arr[j]){
                System.out.println("Element found at index: "+j);
                break;
            }
        }

    }
}
