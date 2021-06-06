import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<Email> emails = new ArrayList<>();
        emails.add(new Email("ahmed@gmail.com"));
        emails.add(new Email("yoyo@gmail.com"));
        emails.add(new Email("hossam@gmail.com"));
        emails.add(new Email("hossam@hey.com"));
        emails.add(new Email("tantawy@yahoo.com"));
        emails.add(new Email("samir@yahoo.com"));
        
        emails.stream()
            .map(Email::getEmail)
            .forEach(System.out::println);
        ;
    }
}
