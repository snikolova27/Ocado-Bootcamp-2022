import java.util.stream.Stream;

public class streams {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5)
                .map(x -> Math.pow(x,2))
                .filter(x -> x % 2 == 1)
                .forEach(x -> System.out.println(x));
                //.anyMatch(x -> x % 2 == 0);
    }
}
