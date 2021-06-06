import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class flatMap {
    public static void main(String[] args) {
        List<List<Email>> emails = new ArrayList<>();
        emails.add(Arrays.asList(new Email("ahmed@gmail.com"), new Email("yoyo@gmail.com"), new Email("hossam@gmail.com")));
        emails.add(Arrays.asList(new Email("hossam@hey.com")));
        emails.add(Arrays.asList(new Email("tantawy@yahoo.com"), new Email("samir@yahoo.com")));
        
        emails.stream()
            .flatMap((e) -> e.stream())
            .map(e -> e.getEmail())
            .forEach(System.out::println);
        ;
    }
}
