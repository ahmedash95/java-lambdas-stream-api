import java.util.List;
import java.util.stream.Stream;

public class filter {
    public static void main(String[] args) {
        Stream<String> emails = Stream.of("first@gmail.com","second@yahoo.com","third@hey.com","forth@hey.com");
        emails.filter((e) -> e.endsWith("@hey.com")).forEach(System.out::println);
    }
}
