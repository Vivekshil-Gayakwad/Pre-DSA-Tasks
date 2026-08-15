public class Car extends Vehicle{

    Car(){
        super(4,"blue",45.6f);
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        System.out.println(c1.tyres);
    }
}
