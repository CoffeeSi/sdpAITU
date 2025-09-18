public class XiaomiDeviceFactory implements DeviceFactory {
    public Phone makePhone() {
        return new XiaomiPhone();
    }

    public Laptop makeLaptop() {
        return new XiaomiBook();
    }
}