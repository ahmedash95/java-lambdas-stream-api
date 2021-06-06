import java.util.function.BiPredicate;

public class BiPredicateDemo {

    static boolean isEmailAllowed(Email email, String host, BiPredicate<Email, String> pred) {
        return pred.test(email, host);
    }
    public static void main(String args[]) {

        Email email = new Email("ahmed@hey.com");

        boolean eligible = isEmailAllowed(email, "@hey.com", (p, h) -> p.getEmail().endsWith(h));

        System.out.println("Is email allowed: " + (eligible ? "Yes" : "NO"));
    }
}

