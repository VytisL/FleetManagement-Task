public class Motorcycle extends Vehicle{

    boolean hasSideCar;

    public Motorcycle(String brand, String model, int year, boolean hasSideCar){
        super(brand, model, year);
        this.hasSideCar = hasSideCar;
    }

    @Override
    void startEngine() {
        System.out.println("Motorcycle engine started");
    }
}
