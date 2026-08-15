//1.	Check whether a string is a palindrome.
//2.	Count vowels and consonants in a string.

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.next();
        isPalindrome(str);
        countVowelsConsonants(str);
    }

    public static void isPalindrome(String str){
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        if(reverse.equals(str)){
            System.out.println("String is a palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }
    }

    public static void countVowelsConsonants(String str){
        int countVowels = 0;
        int countConsonants = 0;
        char[] vowels = {'a','e','i','o','u'};
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                countVowels += 1;
            }
            else{
                countConsonants += 1;
            }
        }

        System.out.println("Count of Vowels: "+countVowels);
        System.out.println("Count of Consonants: "+countConsonants);
    }
}
