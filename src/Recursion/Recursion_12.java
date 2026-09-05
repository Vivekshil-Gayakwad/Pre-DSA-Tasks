package Recursion;

public class Recursion_12 {
    public static void main(String[] args) {
        int fib = fib(2);
        System.out.println(fib);
    }

    public static int fib(int num){
        if(num <= 1){
            return num;
        }
        return fib(num - 1) + fib(num - 2);
    }

}
