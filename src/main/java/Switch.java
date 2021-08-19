import java.util.Arrays;
import java.util.stream.Collectors;

public class Switch {

    public static String switcheroo(String word) {

        return Arrays.asList(word.split("")).stream()
                .map(letter -> switchAB(letter)).collect(Collectors.joining(""));
    }

    public static String switchAB(String letter) {
        if (letter.equals("a")) {
            return "b";
        } else if (letter.equals("b")) {
            return "a";
        }
        return "c";
    }
}
