public class IOSApplicationFactory implements ApplicationFactory {
    public Application createApplication() {
        return new IOSApplication();
    }
}
