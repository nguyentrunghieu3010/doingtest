import java.util.Arrays;
import java.util.Comparator;

public class LargestWordInAString {

    public static String getLargestWord(String sen) {
        return Arrays.stream(sen.split("\\W+")).max(Comparator.comparingInt(String::length)).orElse(null);
    }

    public static void main(String[] args) {
        System.out.println(getLargestWord(s));
    }
}
