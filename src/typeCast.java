//1.	Perform implicit type casting from int to double.
//2.	Perform explicit type casting from double to int.

public class typeCast extends dataTypes{
    public static void main(String[] args) {
        int num1 = 2425;
        double num2 = 87463.5413;
        double num3 = num1;
        int num4 = (int)num2;

        System.out.println("double: "+num3);
        System.out.println("int: "+num4);



    }
}
