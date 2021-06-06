import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        HashMap<String, Email> employees = new HashMap<>();
        employees.put("ahmed", new Email("ahmed@hey.com"));
        employees.put("tantawy", new Email("tantawy@hey.com"));

        List<Optional<Email>> emails = new ArrayList<>();
        emails.add(Optional.ofNullable(employees.get("samir")));
        emails.add(Optional.ofNullable(employees.get("tantawy")));
        emails.add(Optional.ofNullable(employees.get("ahmed")));

        emails.stream()
            .filter(Optional::isPresent)
            .map(Optional::get)
            .map(Email::getEmail)
            .forEach(System.out::println);
    }
}
