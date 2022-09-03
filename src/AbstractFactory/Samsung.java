package AbstractFactory;

public class Samsung extends Device {
    String ram;
    String processor;
    Samsung(String ram, String processor){
        this.processor = processor;
        this.ram = ram;
    }

    @Override
    String getDetails() {
        return "Samsung Configuration is : Ram \t"+this.ram +" Processor  \t" +this.processor;
    }
    public String toString(){
        return "Nokia [processor=" + processor + ", ram=" + ram + "]";
    }
}
