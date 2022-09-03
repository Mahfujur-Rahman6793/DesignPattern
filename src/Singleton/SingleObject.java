package Singleton;

public class SingleObject {
    private static SingleObject singleObject;
    private SingleObject(){

    }
    public static SingleObject getObject(){
        if (singleObject == null){
            singleObject = new SingleObject();
        }
        return singleObject;
    }

    public void message(){
        System.out.println("Welcome");
    }

}
