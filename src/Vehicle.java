public abstract class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle (String brand, String model, int year){
       if(year < 1886 || year > 2024) {
           throw new ArithmeticException("Invalid year");
       }
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    abstract void startEngine();
    public void displayInfo() {
        System.out.println("Brand: " + brand +"\n" +
                            "Model: " + model + "\n" +
                            "Year: " + year);
    }

}
