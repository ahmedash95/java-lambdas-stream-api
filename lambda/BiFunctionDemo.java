import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<Email, String, Email> fixIfInvalid = (e, s) -> {
            if(!e.getEmail().contains("@")) e.setEmail(e.getEmail()+s);
            return e;
        };

        System.out.println(fixIfInvalid.apply(new Email("Hello"), "@world.net").getEmail());
    }    
}
