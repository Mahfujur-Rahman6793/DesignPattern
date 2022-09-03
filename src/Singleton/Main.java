package Singleton;

public class Main {
    public static void main(String[] args) {
        SingleObject singleObject1 = SingleObject.getObject();
        SingleObject singleObject2 = SingleObject.getObject();
        System.out.println(singleObject1);
        System.out.println(singleObject2);
        singleObject2.message();
        singleObject1.message();

    }
}
