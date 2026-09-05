package Recursion;

public class Recursion_10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 6, 8, 9};
        boolean isSorted = isSortedArray(arr,0);
        if(isSorted){
            System.out.println("Array is sorted !");
        }
        else{
            System.out.println("Array is not sorted !");
        }
    }

    public static boolean isSortedArray(int[] arr, int i) {
        if(i == arr.length - 1){
            return true;
        }

        if(arr[i] > arr[i + 1]){
            return false;
        }

        return isSortedArray(arr,i + 1);
    }
}
