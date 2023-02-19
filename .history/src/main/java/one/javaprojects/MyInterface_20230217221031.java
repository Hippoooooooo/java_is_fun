import java.util.function.*;

@FunctionalInterface
interface MyInterface {
        int apply(int x, int y);
}

public class Main {
        public static void main(String[] args) {
                MyInterface add = (x, y) -> x + y;
                System.out.println(add.apply(3, 4)); // Output: 7

                MyInterface multiply = (x, y) -> x * y;
                System.out.println(multiply.apply(3, 4)); // Output: 12

                Function<Integer, String> toString = x -> Integer.toString(x);
                System.out.println(toString.apply(123)); // Output: "123"
        }
}
