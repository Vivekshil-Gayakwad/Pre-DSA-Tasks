package Math;

import java.util.Scanner;

public class Math_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if(num <= 1){
            System.out.println("Number is not Prime.");
        }
        else{
            if(isPrime){
                System.out.println("Number is Prime.");
            }
            else{
                System.out.println("Number is not Prime.");
            }
        }
    }

    public static boolean isPrime(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
