package structural.adapter.employee;

import java.util.List;

public class AdapterDemo {
    public  static void main (String[] args){
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        for(Employee e : employees) {
            System.out.println("ID: " + e.getId() + ", Name: " + e.getName()
                    + ", Last name: " + e.getLastName());
        }
    }
}
