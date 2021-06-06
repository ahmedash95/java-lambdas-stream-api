import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class map {
    public static void main(String[] args) {
        Stream<String> emails = Stream.of("first@gmail.com","second@yahoo.com","third@hey.com","forth");
        emails.map((e) -> {
            if(!e.contains("@"))
                return e+"@default.com";
            return e;
        }).forEach(System.out::println);
    }
}
