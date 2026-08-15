// 1.	Create a method that returns the factorial of a number.
//2.	Create a method that returns whether a number is prime.

import java.util.Scanner;

public class returnType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int factorial = factorial(num);
        System.out.println("factorial: "+factorial);
        if(num <= 1){
            System.out.println("Number is not Prime number.");
        }
        else{
            if(isPrime(num)){
                System.out.println("Number is Prime number.");
            }
            else{
                System.out.println("Number is not Prime number.");
            }
        }
    }

    public static int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <=num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static boolean isPrime(int num){
        boolean isPrime = true;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
