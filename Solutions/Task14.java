import java.util.Set;
import java.util.stream.Collectors;

public class CompareTwoStrings {
    public static boolean compareTwoStrings(String word1, String word2) {

        boolean consistOfSameLetters;

        Set<Character> setWord1 = word1.chars()
                .mapToObj(x -> (char)x)
                .collect(Collectors.toSet());

        Set<Character> setWord2 = word2.chars()
                .mapToObj(x -> (char)x)
                .collect(Collectors.toSet());

        consistOfSameLetters = setWord1.equals(setWord2)
                ? true
                : false;

        return consistOfSameLetters;
    }

}
