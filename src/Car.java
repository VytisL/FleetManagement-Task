public class Car extends Vehicle{

    int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors){
        super(brand, model, year);
        if(numberOfDoors<0){
            throw new ArithmeticException("Invalid number of doors");
        }
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void startEngine() {
        System.out.println("Car engine started");
    }
}
