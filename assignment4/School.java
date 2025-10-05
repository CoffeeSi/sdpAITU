public class School extends Building {
    public School(IConstruction construction) {
        super(construction);
    }

    @Override
    public void build() {
        System.out.print("School");
        construction.construct();
    }
}
