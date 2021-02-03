package Mitarbeiter;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {
    ArrayList<Employee> employees = new ArrayList<>();

    public double calcTotalSalary(){
        ArrayList<Employee> found = new ArrayList<>();
        double salaryAll = 0.0;
        for (Employee e : employees) {
            salaryAll += e.getFullSalary();
        }
        return salaryAll;
    }

    public void addEmployee(Employee e1) {
        employees.add(e1);
    }

//    public HashMap<String, Double> getSalaryByDepartment(){
//        HashMap<String, Double> resultMap = new HashMap<>();
//        double salary = 0.0;
//        for (Employee e : employees){
//
//            if (resultMap.containsKey(e.department)){
//                salary += e.getFullSalary();
//                resultMap.put(e.department,salary);
//            }
//            else {
//                salary = e.getFullSalary();
//                resultMap.put(e.department, e.getFullSalary());
//            }
//        }
//        return resultMap;
//    }

    public HashMap<String, Double> getSalaryByDepartment() {
        HashMap<String, Double> DepartmentSalary = new HashMap<>();
        double salary=0.0;

        for (Employee employee : employees) {
            if (DepartmentSalary.containsKey(employee.department)) {
                salary += employee.getFullSalary();
                DepartmentSalary.put(employee.department, salary);
            } else {
                salary = employee.getFullSalary();
                DepartmentSalary.put(employee.department, employee.getFullSalary());
            }
        }

        return DepartmentSalary;
    }
}
