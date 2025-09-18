public class AndroidApplication implements Application {
    @Override
    public void open() {
        System.out.println("Openning Android Application");
    }

    @Override
    public void delete() {
        System.out.println("Deleting Android Application");
    }
}
