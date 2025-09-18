public class Main {
    public static void main(String[] args) {
        DeviceFactory appleFactory = new AppleDeviceFactory();
        Phone iPhone17 = appleFactory.makePhone();
        Laptop macBook = appleFactory.makeLaptop();
        iPhone17.launchPhone();
        macBook.launchLaptop();
        
        DeviceFactory xiaomiFactory = new XiaomiDeviceFactory();
        Phone xiaomi15ultra = xiaomiFactory.makePhone();
        Laptop xiaomiBook14 = xiaomiFactory.makeLaptop();
        xiaomi15ultra.launchPhone();
        xiaomiBook14.launchLaptop();
    } 
}
