public class Main {
    public static void main(String[] args) {
        ApplicationFactory androidFactory = new AndroidApplicationFactory();
        Application androidApp = androidFactory.createApplication();
        androidApp.open();
        androidApp.delete();

        ApplicationFactory iosFactory = new IOSApplicationFactory();
        Application iosApp = iosFactory.createApplication();
        iosApp.open();
        iosApp.delete();
    }
}
