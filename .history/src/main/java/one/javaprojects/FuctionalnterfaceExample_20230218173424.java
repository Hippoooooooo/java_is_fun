package one.javaprojects;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
        int result = add.apply (3,4);
        System.out.println(result); // Output: 7

        MyInterface multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(3, 4)); // Output: 12

        Function<Integer, String> toString = x -> Integer.toString(x);
        System.out.println(toString.apply(123)); // Output: "123"


   
    List<String> strings = Arrays.asList("foo", "bar", "baz", "qux","fox","tec");

    int count = strings.stream()
    .filter(s -> s.startsWith("f"))
    .map(String::toUpperCase)
    // .forEach(s -> System.out.append("d")
    // .forEach(System.out::println);
    .mapToInt(String::length)
    .sum();
    System.out.println("The count is " + count);

    // for loop to iterate each e of the string
    for(int i = 0; i< strings.size();i ++){
        System.out.println(i + " : " + strings.get(i));
    }

    // 
    String abc = strings.stream()
            .sorted()
            .reduce("", (a, b) -> a + " | " + b);

    System.out.print(abc);


    // to append a number to each element of the string
    strings.forEach(s -> {
        StringBuilder sb = new StringBuilder(s);
        s = sb.append(s).toString();
        System.out.println(s);

    });
    }
}