package oops.designPatterns.adapter.employeeAdapters;

import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeCSV;

public class EmployeeAdapterCSV implements Employee {
    EmployeeCSV employeeCsv;

    public EmployeeAdapterCSV(EmployeeCSV employeeCsv) {
        this.employeeCsv = employeeCsv;
    }

    @Override
    public String getId() {
        return String.valueOf(employeeCsv.getId());
    }

    @Override
    public String getFirstName() {
        return employeeCsv.getFirstname();
    }

    @Override
    public String getLastName() {
        return employeeCsv.getLastname();
    }

    @Override
    public String getEmail() {
        return employeeCsv.getEmailAddress();
    }
}
