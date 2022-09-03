package Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeDirectory implements Employee{
    List<Employee> employees = new ArrayList <>();


    @Override
    public void ShowEmployeeDetails() {
        for (Employee e : employees){
            e.ShowEmployeeDetails();
        }
    }
    public void Add(Employee e){
        employees.add(e);
    }
    public void Remove(Employee e){
        employees.remove(e);
    }
}
