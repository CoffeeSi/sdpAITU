public class AndroidApplicationFactory implements ApplicationFactory {
    public Application createApplication() {
        return new AndroidApplication();
    }
}
