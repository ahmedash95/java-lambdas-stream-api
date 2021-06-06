import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Email, String> getHost = (e) -> e.getEmail().split("@")[1];

        System.out.println("Host: " + getHost.apply(new Email("ahmedash@hey.com")));
    }
}
