public class Employee {
    static float totalSalary = 0;
    int empId = 101;
    String name = "Vivek";
    float salary = 10100.3f;

    public float calcTotalSalary(){
        totalSalary += salary;
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        float totalSalary = emp1.calcTotalSalary();
        System.out.println("total salary: "+totalSalary);
        Employee emp2 = new Employee();
        float totalSalary1 = emp2.calcTotalSalary();
        System.out.println("total salary: "+totalSalary1);
    }


}
