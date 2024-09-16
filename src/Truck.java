import javax.lang.model.type.ArrayType;

public class Truck extends Vehicle{

    int cargoCapacity;

    public Truck(String brand, String model, int year, int cargoCapacity){
        super(brand, model, year);
        if(cargoCapacity<0){
            throw new ArithmeticException("Invalid cargo capacity");
        }
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    void startEngine() {
        System.out.println("Truck engine started");
    }
}
