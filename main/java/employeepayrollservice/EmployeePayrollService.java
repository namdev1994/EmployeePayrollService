package employeepayrollservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IoService{CONSOLE_IO,FILE_IO,DB_IO,REST_IO}
    List<EmployeePayrollData> employeePayrollList;
    EmployeePayrollService() {
        employeePayrollList=new ArrayList<>();
    }


    public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }
    private void readEmployeePayrollData(Scanner consoleInputReader) //read data from console
    {
        System.out.println("Enter Employee ID: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee name ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee salary ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    private void writeEmployeePayrollData() //write data on console
    {
        System.out.println("\nWriting Employee Payroll Roaster to Console\n" + employeePayrollList);
    }
}
