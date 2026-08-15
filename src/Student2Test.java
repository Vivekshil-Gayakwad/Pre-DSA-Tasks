public class Student2Test {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        String name = s1.getStudentName();
        System.out.println(name);
        int age = s1.getStudentAge();
        System.out.println(age);
        float CGPA = s1.getStudentCGPA();
        System.out.println(CGPA);
        s1.setStudentAge(19);
        int age1 = s1.getStudentAge();
        System.out.println(age1);

    }
}
