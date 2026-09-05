package Recursion;

public class Recursion_9 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 6, 8, 4};
        reverseArray(arr, 0);
    }

    public static void reverseArray(int[] arr, int i) {
        int[] reverseArray = new int[arr.length];
        if(i == arr.length){
            return;
        }
        reverseArray[i] = arr[arr.length - i - 1];
        System.out.println(reverseArray[i]);
        reverseArray(arr, i + 1);

    }
}
