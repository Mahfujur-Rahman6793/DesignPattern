package AbstractFactory;

public class LaptopFactory extends AbstractDeviceFactory{
    @Override
    public Device getGadget(DeviceType deviceType) {
        if (deviceType.equals(DeviceType.HP)) {
            return new HP("4","Intel","Nvidia");
        }
        else if (deviceType.equals(DeviceType.LENEVO)){
            return new Lenevo("8","Intel Pentium","AMD");
        }

        return null;
    }
}
