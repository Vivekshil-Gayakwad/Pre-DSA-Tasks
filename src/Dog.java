public class Dog extends Animal{

    Dog(){
        super(4,"pedigree","brown");
    }

    @Override
    public void sound() {
        System.out.println("Dog is Barking...");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public static void main(String[] args) {
        Animal d1 = new Dog();
        d1.sound();
        d1.eat();
    }
}
