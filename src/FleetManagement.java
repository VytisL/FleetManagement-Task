public class FleetManagement {
    public static void main(String[] args) {
        Car BMW = new Car("BMW", "X1 SUV", 2020, 6);
        Car Toyota = new Car("Toyota", "Prius", 2005, 4);
        Motorcycle Ducati = new Motorcycle("Ducati", "V4", 2023, false);
        Motorcycle Honda = new Motorcycle("Honda", "Cruiser", 1999, true);
        Truck Truck1 = new Truck("Truckbrand", "Big", 1998, 5000);
        Truck Truck2 = new Truck("Truckmake", "small", 2010, 3600);
        ElectricCar Tesla = new ElectricCar("Tesla", "Cybertruck", 2024, 4);
        ElectricCar NotTesla = new ElectricCar("Brand", "Cyberruck", 2012, 5);

        BMW.displayInfo();
        Toyota.displayInfo();
        Ducati.displayInfo();
        Honda.displayInfo();
        Truck1.displayInfo();
        Truck2.displayInfo();
        Tesla.displayInfo();
        NotTesla.displayInfo();


    }
}
