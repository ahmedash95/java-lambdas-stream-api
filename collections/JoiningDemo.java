import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class JoiningDemo {
    public static void main(String[] args) {
        String sentence = Stream.of("Hello,","how", "are","you","doing?")
            .collect(Collectors.joining(" "));

        System.out.println(sentence);
    }
}