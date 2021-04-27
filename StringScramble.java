import java.util.Arrays;
import java.util.List;

public class StringScramble {


    private static boolean isScramble(String str1, String str2) {
        List<String> inputStr1List = Arrays.asList(str1.split(""));
        List<String> inputStr2List = Arrays.asList(str2.split(""));
        return inputStr1List.stream().allMatch(inputStr2List::contains);
    }

    public static void main(String[] args) {

//        String str1 = "cdore";
//        String str2 = "coder";

        String str1 = "h3llko";
        String str2 = "hello";
        System.out.println(isScramble(str1, str2));
    }
}
