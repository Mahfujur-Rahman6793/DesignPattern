package AbstractFactory;

public class MobileFactory extends AbstractDeviceFactory{
    @Override
    public Device getGadget(DeviceType deviceType) {
        if (deviceType.equals(DeviceType.NOKIA)) {
            return new Nokia("3 gb", "Android 9.0 (Pie)");
        }
            else if(deviceType.equals(DeviceType.SAMSUNG)){
                 return new Samsung("4gb", "Android 10");
             }

            return null;

    }
}
