package oops.SOLID.DependencyInversionPrinciple.before.repositories;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;

import java.io.IOException;
import java.util.List;

public interface Repository<T> {
    List<T> findAll();

    void save(T e) throws IOException;
}
