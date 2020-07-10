package oops.SOLID.DependencyInversionPrinciple.before.payments;

import java.util.List;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;
import oops.SOLID.DependencyInversionPrinciple.before.notification.EmployeeEmailSender;
import oops.SOLID.DependencyInversionPrinciple.before.notification.Notifier;

public class EmployeePaymentProcessor implements Processor<Employee> {
    Notifier<Employee> notifier;

    public EmployeePaymentProcessor(Notifier<Employee> notifier) {
        this.notifier = notifier;
    }

    @Override
    public int sendPayments(List<Employee> employees){
        int totalPayments = 0;

        for(Employee employee : employees){
            totalPayments += employee.getMonthlyIncome();
            notifier.notify(employee);
        }

        return totalPayments;
    }
}
