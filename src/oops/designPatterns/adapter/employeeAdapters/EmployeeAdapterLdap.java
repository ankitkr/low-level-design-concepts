package oops.designPatterns.adapter.employeeAdapters;

import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeLdap;

public class EmployeeAdapterLdap implements Employee {
    EmployeeLdap employeeLdap;

    public EmployeeAdapterLdap(EmployeeLdap employeeLdap) {
        this.employeeLdap = employeeLdap;
    }

    @Override
    public String getId() {
        return employeeLdap.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeLdap.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeLdap.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeLdap.getMail();
    }
}
