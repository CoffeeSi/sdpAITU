public class Main {
    public static void main(String[] args) {
        Building woodenHouse = new House(new WoodenConstruction());
        Building concreteHouse = new House(new ConcreteConstruction());
        Building woodenSchool = new School(new WoodenConstruction());
        Building concreteSchool = new School(new ConcreteConstruction());
        woodenHouse.build();
        concreteHouse.build();
        woodenSchool.build();
        concreteSchool.build();
    }
}
