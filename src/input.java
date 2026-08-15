//1.	Input a student's name, age, and CGPA.
//2.	Input the length and breadth of a rectangle and calculate its area.

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String name = input.nextLine();
        System.out.print("Enter the Age: ");
        int age = input.nextInt();
        System.out.print("Enter the CGPA: ");
        double CGPA = input.nextDouble();
        System.out.println("Result:");
        System.out.printf("Name: %s\nAge: %d\nCGPA: %f\n",name,age,CGPA);

        System.out.print("Enter the length: ");
        int length = input.nextInt();
        System.out.print("Enter the breadth: ");
        int breadth = input.nextInt();
        int area = length*breadth;
        System.out.println("Area of Rectangle: "+area+" Unit Square");
    }
}
