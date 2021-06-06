import java.util.function.Function;

public class ComposeDemo {
    public static void main(String[] args) {
        Function<Email, Email> fixInvalidEmails = (e) -> {
            if(!e.getEmail().contains("@")) {
                e.setEmail(e.getEmail()+"@unkown");
            }
            return e;
        };
        Function<Email, String> getHost = (e) -> e.getEmail().split("@")[1];

        System.out.println("Host: " + getHost.compose(fixInvalidEmails).apply(new Email("ahmedash")));
    }
}
