import java.util.function.Predicate;

public class PredicateDemo {

    static boolean isEmailAllowed(Email email, Predicate<Email> pred) {
        return pred.negate().test(email);
    }
    public static void main(String args[]) {

        Email email = new Email("ahmedash@hey.com");

        Predicate<Email> isGmail = (Email e) -> e.getEmail().endsWith("@gmail.com");
        Predicate<Email> isHey = (Email e) -> e.getEmail().endsWith("@hey.com");

        Predicate<Email> pred = isGmail.or(isHey);

        boolean eligible = isEmailAllowed(email, pred);

        System.out.println("Is email allowed: " + (eligible ? "Yes" : "NO"));
    }
}

