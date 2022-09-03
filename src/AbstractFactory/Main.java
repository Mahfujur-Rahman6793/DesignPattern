package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Device lenevo = FactoryGenerator.getFactory(FactoryType.LAPTOPFACTOY).getGadget(DeviceType.LENEVO);
        System.out.println(lenevo.getDetails());
    }
}
