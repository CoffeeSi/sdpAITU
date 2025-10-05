public abstract class Building {
    protected IConstruction construction;

    protected Building(IConstruction construction) {
        this.construction = construction;
    }

    public abstract void build();
}
