//1.	Find the factorial using recursion.
//2.	Print Fibonacci series using recursion.

public class Recursion {
    public static void main(String[] args) {
        int factorial = factorial(6);
        System.out.println("Factorial: "+factorial);
    }

    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        return factorial(num-1)*num;
    }
}
