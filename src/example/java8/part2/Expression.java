package example.java8.part2;

@FunctionalInterface

public interface Expression<T> {

    boolean isEqual(T data);
}
