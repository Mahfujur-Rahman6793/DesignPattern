package Composite;



public interface Employee {
    public void ShowEmployeeDetails();
}

class Developer implements Employee{
    private String EmployeeName;
    private long EmpId;
    private String position;
    Developer(String EmployeeName, long EmpId, String position){
        this.EmployeeName = EmployeeName;
        this.EmpId = EmpId;
        this.position = position;
    }

    @Override
    public void ShowEmployeeDetails() {
        System.out.println("Name : " +EmployeeName+ "\nEmployee Id: " +EmpId + "\nPosition : "+position+"\n\n\n");

    }
}
class Manager implements Employee{
    private String EmployeeName;
    private long EmpId;
    private String position;
    Manager(String EmployeeName, long EmpId, String position){
        this.EmployeeName = EmployeeName;
        this.EmpId = EmpId;
        this.position = position;
    }

    @Override
    public void ShowEmployeeDetails() {
        System.out.println("Name : " +EmployeeName+ "\nEmployee Id: " +EmpId + "\nPosition : "+position+"\n\n\n");

    }
}
