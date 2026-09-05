package Recursion;

public class Recursion_8 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,6,8,4};
        int max = maxNumberInArray(arr,0);
        System.out.println("Max Number: "+ max);
        int min = minNumberInArray(arr,0);
        System.out.println("Min Number: "+ min);
    }

    public static int maxNumberInArray(int[] arr, int i){
        if(i == arr.length - 1){
            return arr[i];
        }

        return Math.max(arr[i] , maxNumberInArray(arr, i + 1));
    }

    public static int minNumberInArray(int[] arr, int i){
        if(i == arr.length - 1){
            return arr[i];
        }

        return Math.min(arr[i] , minNumberInArray(arr, i + 1));
    }
}
