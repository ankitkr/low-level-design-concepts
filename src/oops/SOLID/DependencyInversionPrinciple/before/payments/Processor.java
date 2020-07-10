package oops.SOLID.DependencyInversionPrinciple.before.payments;

import java.util.List;

public interface Processor<T> {
    int sendPayments(List<T> e);
}
