 package Composite;

public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Miraz",1222,"VP");
        Developer dev2 = new Developer("Afrin", 1444,"CTO");
        CompositeDirectory eng = new CompositeDirectory();
        eng.Add(dev1);
        eng.Add(dev2);
        Manager manager1 = new Manager("Aman", 1233, "Manager");
        Manager manager2 = new Manager("Akhi", 1666, "Admin");
        CompositeDirectory man = new CompositeDirectory();
        man.Add(manager1);
        man.Add(manager2);
        CompositeDirectory directory = new CompositeDirectory();
        directory.Add(eng);
        directory.Add(man);
        directory.ShowEmployeeDetails();

    }
}
