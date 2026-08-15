//1.	Create a Student class and display details.
//2.	Create an Employee class and calculate salary.

class Student{
    String name = "vivek";
    int age = 18;
    float CGPA = 8.5f;

    public void displayDitail(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("CGPA: "+CGPA);
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.displayDitail();
    }

}
