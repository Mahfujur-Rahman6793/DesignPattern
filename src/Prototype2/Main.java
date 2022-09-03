package Prototype2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Employee Id Number : \t");
        int employeeid = Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.println("Enter Your Employee Name : \t");
        String employeename = br.readLine();
        System.out.print("\n");

        System.out.println("Enter Your Employee Designation : \t");
        String designation = br.readLine();
        System.out.print("\n");

        System.out.println("Enter Your Employee Salary : \t");
        int salary = Integer.parseInt(br.readLine());
        System.out.print("\n");

        EmployeeRecord e1 = new EmployeeRecord(employeeid,employeename,designation,salary);
        System.out.print("\n");
        e1.showRecord();
        System.out.print("\n");
        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
        e2.setEmployeeid(88);
        e2.setEmployeename("MIraz");
        e2.showRecord();





    }
}
