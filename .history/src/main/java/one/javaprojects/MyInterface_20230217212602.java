package one.javaprojects;

import java.util.function.*;;

public class Main {

    @FunctionalInterface
    interface MyInterfa {
        int apply(int x, int y);
    }

    public static void main(String[] args) {
        MyFunction add = (x, y) -> x + y;
        System.out.println(add.apply(3, 4)); // Output: 7

        MyFunction multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(3, 4)); // Output: 12

        Function<Integer, String> toString = x -> Integer.toString(x);
        System.out.println(toString.apply(123)); // Output: "123"
    }

}

    




