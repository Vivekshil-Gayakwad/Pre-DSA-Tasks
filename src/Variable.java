//1. Variables
//1.	Declare variables of all primitive data types and print their values.
//2.	Write a program to swap two integer variables.

public class Variable{
    public static void main(String[] args) {
        byte num1 = 1;
        short num2 = 23;
        int num3 = 2425;
        long num4 = 9852387458587l;
        float num5 = 43.5f;
        double num6 = 87463.5413;
        char ch = 'f';
        boolean cn = true;
        System.out.println("Declare variables of all primitive data types and print their values.");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(ch);
        System.out.println(cn);

        System.out.println("Write a program to swap two integer variables.");
        int a = 4;
        int b = 5;
        System.out.println("before swap num1: "+a);
        System.out.println("before swap num2: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swap num1: "+a);
        System.out.println("after swap num2: "+b);
    }
}