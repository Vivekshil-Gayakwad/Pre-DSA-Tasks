//1.	Print your biodata in a formatted way.
//2.	Print the following pattern:
//Java
//DSA
//Programming

import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your biodata: ");
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your college: ");
        String college = input.next();
        System.out.print("Enter your branch: ");
        String branch = input.next();
        System.out.print("Enter your CGPA: ");
        float CGPA = input.nextFloat();
        System.out.printf("Name: %s\nAge: %d\nCollege: %s\nBranch: %s\nCGPA: %f\n",name,age,college,branch,CGPA);

        System.out.println("Java");
        System.out.println("DSA");
        System.out.println("Programming");
    }
}
