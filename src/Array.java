// 1.	Find the largest element in an array.
//2.	Reverse an array.

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = arrayInput(size);
        System.out.println("Original Array:");
        printArray(array);
        int max = largestElement(array);
        System.out.println("Largest Element in array is: "+max);
        int[] reverseArray = reverseArray(array);
        System.out.println("Reversed Array:");
        printArray(reverseArray);
    }

    public static int[] arrayInput(int size){
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Element: ");
            int el = input.nextInt();
            array[i] = el;
        }
        return  array;
    }

    public static void printArray(int[] array){
        for (int j : array) {
            System.out.printf("%d\t",j);
        }
        System.out.println();
    }

    public static int largestElement(int[] array){
        int max = array[0];
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    public static int[] reverseArray(int[] array){
        int[] reverseArray = new int[array.length];
        int j = 0;
        for(int i = array.length-1; i >= 0; i--){
            reverseArray[j] = array[i];
            j++;
        }
        return reverseArray;
    }
}
