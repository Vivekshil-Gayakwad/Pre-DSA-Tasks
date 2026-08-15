//1.	Create a method to calculate the area of a circle.
//2.	Create a method to find the maximum of two numbers.

public class methods {
    public static void main(String[] args) {
        areaOfCircle(5);
        maxNumber(2,4);
    }

    public static void areaOfCircle(int radius){
        float area = (float)(Math.PI*Math.pow(radius,2));
        System.out.println("Area of circle: "+area);
    }

    public static void maxNumber(int num1,int num2){
        if(num1>num2){
            System.out.println("Num1 is greater.");
        }
        else{
            System.out.println("Num2 is greater.");
        }
    }
}
