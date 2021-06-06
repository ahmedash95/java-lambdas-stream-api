import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<Email> fixIfInvalid = (e) -> {
            if (!e.getEmail().contains("@")) e.setEmail(e.getEmail() + "@unkown");
            return e;
        };

        System.out.println(fixIfInvalid.apply(new Email("ahmedash")).getEmail());
    }
}
