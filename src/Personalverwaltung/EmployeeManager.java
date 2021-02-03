package Personalverwaltung;

import Mitarbeiter.Empleyee;

import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public Employee findByEmpNumber(int number){
        for (Employee e : employees){
            if (number == e.getEmpNumber()){
                return e;
            }
        }
        return null;
    }

    public ArrayList<Employee> findByDepartment(String department){
        ArrayList<Employee> result = new ArrayList<>();

        for (Employee e : employees){
            if (e.getDepartment() == department){
                result.add(e);
            }
        }
        return result;
    }
}
