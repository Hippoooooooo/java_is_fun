package one.javaprojects;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

class FunctionalInterfaceExample {

    @FunctionalInterface
    interface MyInterface {
        int apply(int x, int y);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        MyInterface add = (x, y) -> x + y;
        int result = add.app
        System.out.println(add.apply(3, 4)); // Output: 7

        MyInterface multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(3, 4)); // Output: 12

        Function<Integer, String> toString = x -> Integer.toString(x);
        System.out.println(toString.apply(123)); // Output: "123"

        // Define a functional interface using a lambda expression
        IntBinaryOperator sum = (a, b) -> a + b;

        // Use the functional interface to calculate the sum of two integers
        int result = sum.applyAsInt(8, 4);
        System.out.println(result); // Output: 7
        
        List<String> strings = Arrays.asList("foo", "bar", "baz", "qux");

      strings.stream()
    .filter(s -> s.startsWith("b"))
    .map(String::toUpperCase)
    .forEach(System.out::println);
    }
}