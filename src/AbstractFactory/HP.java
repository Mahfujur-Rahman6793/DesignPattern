package AbstractFactory;

public class HP extends Device{
    String ram;
    String processor;
    String gpu;
    HP(String ram, String processor,String gpu){
        this.gpu = gpu;
        this.processor = processor;
        this.ram = ram;
    }
    @Override
    String getDetails() {
        return "Hp Laptop Configuration :\n ram \t"+this.ram + "\t Processor \t"+this.processor+"\t GPU \t"+this.gpu;
    }
    public String toString(){
        return "Hp Laptop [ Ram : "+ram +" Processor "+processor + " GPU "+gpu+"]";
    }
}
