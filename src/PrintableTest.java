public class PrintableTest implements Printable{
    @Override
    public void getName() {
        System.out.println("Vivek");
    }

    @Override
    public void getAge() {
        System.out.println(18);
    }

    public static void main(String[] args) {
        PrintableTest p1 = new PrintableTest();
        p1.getName();
        p1.getAge();
    }
}
