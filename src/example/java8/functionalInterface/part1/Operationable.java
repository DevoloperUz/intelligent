package example.java8.functionalInterface.part1;

@FunctionalInterface

// <T> - Generic Type
public interface Operationable <F, T>{

    F calculate(T a, T b);
}
