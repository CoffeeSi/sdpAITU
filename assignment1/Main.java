public class Main {
    public static void main(String[] args) {
        Car toyotaSupra = new Car.CarBuilder()
                    .setName("Toyota Supra")
                    .setEngine("2JZ")
                    .setWheels(4)
                    .setHandDrive(true)
                    .build();

        System.out.println(toyotaSupra);
    }
}
