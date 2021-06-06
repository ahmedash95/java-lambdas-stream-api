import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Email> consumer1 = (e) -> System.out.println("Email is: " + e.getEmail());
        Consumer<Email> consumer2 = (e) -> {
            System.out.println("Change email");
            e.setEmail("changed@hey.com");
        };
        Consumer<Email> consumer3 = (e) -> System.out.println("Email now is: " + e.getEmail());

        Email email = new Email("ahmedash@hey.com");

        consumer1.andThen(consumer2).andThen(consumer3).accept(email);
    }
}
