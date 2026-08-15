public class Animal {
    protected int legs;
    protected String food;
    protected String skinColour;

    public Animal(int legs,String food,String skinColour){
        this.legs = legs;
        this.food = food;
        this.skinColour = skinColour;
    }

    public void sound(){
        System.out.println("Animal is shouting...");
    }

    public void eat(){
        System.out.println("Animal is eating...");
    }
}
