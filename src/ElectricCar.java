public class ElectricCar extends Car{
    public ElectricCar(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year, numberOfDoors);
    }
    void chargeBattery(){
        System.out.println("Battery charged");
    }
}
