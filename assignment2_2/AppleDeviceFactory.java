public class AppleDeviceFactory implements DeviceFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }

    @Override
    public Laptop makeLaptop() {
        return new MacBook();
    }
}
