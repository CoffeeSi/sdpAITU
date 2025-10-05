public class House extends Building {
    public House(IConstruction construction) {
        super(construction);
    }

    @Override
    public void build() {
        System.out.print("House");
        construction.construct();
    }
}
