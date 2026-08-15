public class Constructor {
    String name;
    int age;
    float CGPA ;

    public Constructor(String name,int age,float CGPA){
        this.name = name;
        this.age = age;
        this.CGPA = CGPA;
    }

    public void displayDitail(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("CGPA: "+CGPA);
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor("vivek",18,8.5f);
        c1.displayDitail();
        Constructor c2 = new Constructor("pavan",20,8.5f);
        c2.displayDitail();
        Constructor c3 = new Constructor("hitesh",19,8.5f);
        c3.displayDitail();
    }
}
