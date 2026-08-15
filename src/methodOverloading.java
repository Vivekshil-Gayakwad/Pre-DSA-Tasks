//1.	Overload a method to add two integers and two doubles.
//2.	Overload a method to calculate the area of a square and rectangle.

public class methodOverloading {
    public static void main(String[] args) {
        add(2.2,4);
        area(2);
        area(2,4);
    }

    public static void add(int num1,int num2){
        System.out.println("Sum by int: "+num1+num2);
    }

    public static void add(double num1,double num2){
        System.out.println("Sum by double: "+num1+num2);
    }

    public static void area(int length){
        System.out.println("Area of square: "+Math.pow(length,2));
    }

    public static void area(int length,int breagth){
        System.out.println("Area of rectangle: "+length*breagth);
    }
}
