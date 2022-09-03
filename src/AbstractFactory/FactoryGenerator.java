package AbstractFactory;

public class FactoryGenerator {
    public static AbstractDeviceFactory getFactory(FactoryType factoryType){
        if (factoryType.equals(FactoryType.LAPTOPFACTOY)) {
            return new LaptopFactory();
        }
        else if (factoryType.equals(FactoryType.MOBILEFACTORY)) {
            return new MobileFactory();
        }

        return null;
    }
}
