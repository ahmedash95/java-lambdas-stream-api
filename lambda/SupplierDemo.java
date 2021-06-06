import java.util.function.Supplier;
import java.util.function.Predicate;

public class SupplierDemo {
    static boolean isEmailAllowed(Supplier<Email> supplier, Predicate<Email> pred) {
        return pred.test(supplier.get());
    }

    public static void main(String args[]) {

        Supplier<Email> email = () -> new Email("ahmedash@hey.com");

        Predicate<Email> isHey = (Email e) -> e.getEmail().endsWith("@hey.com");

        boolean eligible = isEmailAllowed(email, isHey);

        System.out.println("Is email allowed: " + (eligible ? "Yes" : "NO"));
    }
}
