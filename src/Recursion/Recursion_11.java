package Recursion;

public class Recursion_11 {
    public static void main(String[] args) {
        int[] arr = {4, 8, 6, 2, 6, 8, 4};
        boolean isPalindrome = isPalindrome(arr,0);

        if (isPalindrome) {
            System.out.println("Palindrome..");
        }
        else {
            System.out.println("Not Palindrome...");
        }
    }

    public static boolean isPalindrome(int[] arr, int i){
        if(i >= arr.length - 1){
            return true;
        }
        if(arr[i] != arr[arr.length - i - 1]){
            return false;
        }
        return isPalindrome(arr,i + 1);
    }
}
