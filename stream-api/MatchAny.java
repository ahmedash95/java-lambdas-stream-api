import java.util.ArrayList;
import java.util.List;

public class MatchAny {
    public static void main(String[] args) {
        List<Email2> emails = new ArrayList<>();
        emails.add(new Email2("ahmed@gmail.com"));
        emails.add(new Email2("tantawy@gmail.com"));
        emails.add(new Email2("samir@hey.com"));
        emails.add(new Email2("exception"));

        // anyMatch complexity is O(1)
        boolean result = emails.stream().anyMatch(e -> {
            try {
                return e.retriveEmail().contains("@hey.com");
            } catch(Exception ex) {
                System.out.println(ex.getMessage());
                return false;
            }
        });

        System.out.println("Has Hey emails? " + (result ? "YES" : "NO"));
    }
}


class Email2 extends Email {
    public Email2(String e) {
        super(e);
    }

    public String retriveEmail() throws Exception {
        if(super.getEmail().equals("exception")) {
            throw new Exception("Invalid Email");
        }

        return super.getEmail();
    }
}
