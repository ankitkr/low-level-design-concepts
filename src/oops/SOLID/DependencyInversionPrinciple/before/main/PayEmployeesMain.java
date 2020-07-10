package oops.SOLID.DependencyInversionPrinciple.before.main;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;
import oops.SOLID.DependencyInversionPrinciple.before.notification.EmployeeEmailSender;
import oops.SOLID.DependencyInversionPrinciple.before.notification.Notifier;
import oops.SOLID.DependencyInversionPrinciple.before.payments.EmployeePaymentProcessor;
import oops.SOLID.DependencyInversionPrinciple.before.repositories.EmployeeFileRepository;
import oops.SOLID.DependencyInversionPrinciple.before.repositories.Repository;
import oops.SOLID.DependencyInversionPrinciple.before.serializer.EmployeeFileSerializer;


import java.util.List;

public class PayEmployeesMain {

    public static void main(String[] args) {
        Repository<Employee> employeeRepository =
                new EmployeeFileRepository(new EmployeeFileSerializer());
        List<Employee> employees = employeeRepository.findAll();
        Notifier<Employee> notifier = new EmployeeEmailSender();

        EmployeePaymentProcessor paymentProcessor = new EmployeePaymentProcessor(notifier);
        int totalPayments = paymentProcessor.sendPayments(employees);
        System.out.println("Total payments " + totalPayments);
    }
}
