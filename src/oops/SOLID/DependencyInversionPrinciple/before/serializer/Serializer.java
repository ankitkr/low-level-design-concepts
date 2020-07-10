package oops.SOLID.DependencyInversionPrinciple.before.serializer;

public interface Serializer<T> {
    String serialize(T e);
}
