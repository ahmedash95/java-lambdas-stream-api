import java.util.ArrayList;
import java.util.List;

public class ConstructorReference {
    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();
        emails.add("ahmed@gmail.com");
        emails.add("yoyo@gmail.com");
        emails.add("hossam@gmail.com");
        emails.add("hossam@hey.com");
        emails.add("tantawy@yahoo.com");
        emails.add("samir@yahoo.com");
        
        emails.stream()
            .map(Email::new)
            .forEach(e -> System.out.println(e.getEmail()));
        ;
    }
}
