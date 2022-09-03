package AbstractFactory;

public class Lenevo extends Device{
    String ram;
    String processor;
    String gpu;
    Lenevo(String ram, String processor,String gpu){
        this.gpu = gpu;
        this.processor = processor;
        this.ram = ram;
    }
    @Override
    String getDetails() {
        return "Lenevo Laptop Configuration :\n ram \t"+this.ram + "\t Processor \t"+this.processor+"\t GPU \t"+this.gpu;
    }
    public String toString(){
        return "Lenevo Laptop [ Ram : "+ram +" Processor "+processor + " GPU "+gpu+"]";
    }
}