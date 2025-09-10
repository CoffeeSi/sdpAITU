
public class Car {
    private String name;
    private String engine;
    private int seats;
    private int wheels;
    private boolean leftHandDrive;

    public Car(CarBuilder builder) {
        name = builder.name;
        engine = builder.engine;
        seats = builder.seats;
        wheels = builder.wheels;
        leftHandDrive = builder.leftHandDrive;
    }

    public static class CarBuilder {
        private String name;
        private String engine;
        private int seats;
        private int wheels;
        private boolean leftHandDrive;

        public CarBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }
        
        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setHandDrive(boolean leftHandDrive) {
            this.leftHandDrive = leftHandDrive;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return name + " " + engine + " " + 
            seats + " " + wheels + 
            (leftHandDrive ? " Left Hand Drive" : " Right Hand Drive");
    } 
}
