package Recursion;

public class Recursion_7 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,6,8,4};
        printArray(arr,0);
    }

    public static void printArray(int[] arr, int i){
        if(i == arr.length){
            return;
        }

        System.out.println(arr[i]);
        printArray(arr, i + 1);
    }
}
