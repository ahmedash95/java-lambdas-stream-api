import java.util.stream.Stream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        System.out.println("------------------------------- Serial Stream  ---------------------------------");
        Stream.of(1, 2, 3, 4, 5, 6, 7).forEach(num -> System.out.println(num + " " + Thread.currentThread().getName()));

        System.out.println("-------------------------------- Parallel Stream -----------------------------");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14).parallel()
                .forEach(num -> System.out.println(num + " " + Thread.currentThread().getName()));
    }
}
