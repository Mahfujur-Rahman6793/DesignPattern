package Prototype2;

public interface Prototype {
    public Prototype getClone();
}
class EmployeeRecord implements Prototype{
    private int employeeid;
    private String employeename,designation;
    private int salary;

    public EmployeeRecord(){
        System.out.println("   Employee Records of Oracle Corporation ");
        System.out.println("---------------------------------------------");
        System.out.println("Eid"+"\t"+"Ename"+"\t"+"Edesignation"+"\t"+"Esalary");
    }

    public EmployeeRecord(int employeeid,String employeename, String designation , int salary){
        this();
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.designation = designation;
        this.salary = salary;

    }
    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public void showRecord(){
        System.out.println(employeeid+"\t\t" +employeename+"\t\t"+designation+"\t\t"+salary);

    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(employeeid, employeename,designation,salary);

    }
}
