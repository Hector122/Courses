package structural.adapter.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB(
                "1234", "John",
                "Wick", "johm_wick@gmail.com");

        employees.add(employeeFromDB);

        EmployeeLdap employeeFromLdap = new EmployeeLdap(
                "5687-chewie", "Han",
                "Solo", "han_solo@gmail.com");

        Employee employeeAdapter = new EmployeeAdapterLdap(employeeFromLdap);
        employees.add(employeeAdapter);

        employees.add(new EmployeeAdapterCSV(
                new EmployeeCSV("576, Sherlock, Holmes, sherlockhomes@gmail.com")));

        return employees;
    }
}
