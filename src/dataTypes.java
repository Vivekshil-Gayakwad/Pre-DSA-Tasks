//1.	Find the size and range of each primitive data type.
//2.	Convert an int to double and double to int.


public class dataTypes {
    public static void main(String[] args) {
        int in = 234;
        double dbl = 451214785.56698;
        double dbl2 = in;
        int in2 = (int)dbl;
        System.out.println("double: "+dbl2);
        System.out.println("int: "+in2);
    }
}
