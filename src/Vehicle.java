public class Vehicle {
    protected int tyres;
    protected String colour;
    protected float fuel;

    public Vehicle(int tyres,String colour,float fuel){
        this.tyres = tyres;
        this.colour = colour;
        this.fuel = fuel;
    }

    protected void start(){
        this.fuel--;
        System.out.println("Vehicle is started....");
    }

    protected void stop(){
        System.out.println("Vehicle is stopped...");
    }
}
