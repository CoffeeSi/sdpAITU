public class IOSApplication implements Application {
    @Override
    public void open() {
        System.out.println("Openning IOS Application");
    }

    @Override
    public void delete() {
        System.out.println("Deleting IOS Application");
    }
}
