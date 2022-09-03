package AbstractFactory;

public class Nokia extends Device{
    String ram;
    String Processor;
    Nokia(String ram, String Processor){
        this.Processor = Processor;
        this.ram = ram;
    }
    @Override
    String getDetails() {
        return "Nokia Configuration is : ram \t"+this.ram + "Processor \t"+this.Processor;
    }
    public String toString(){
        return "Nokia [processor=" + Processor + ", ram=" + ram + "]";
    }
}

