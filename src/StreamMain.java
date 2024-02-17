import java.util.stream.IntStream;

public class StreamMain {

    public static void main(String[] args) {
        IntStream count = IntStream.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4)
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted();
        count.forEach(System.out::println);
    }
}
