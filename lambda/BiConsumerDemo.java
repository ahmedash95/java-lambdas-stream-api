import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Email, String> consumer1 = (e, n) -> System.out.println("Email is: " + e.getEmail());
        BiConsumer<Email, String> consumer2 = (e, n) -> {
            System.out.println("Change email");
            e.setEmail(n);
        };
        BiConsumer<Email, String> consumer3 = (e, n) -> System.out.println("Email now is: " + e.getEmail());

        Email email = new Email("ahmedash@hey.com");

        consumer1.andThen(consumer2).andThen(consumer3).accept(email, "new@hey.com");
    }
}
