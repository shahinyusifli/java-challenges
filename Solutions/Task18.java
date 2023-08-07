import java.util.Arrays;
import java.util.List;

public class Task18 {
    private static Boolean checkVowelInString(String word) {
        Boolean isItConsistOfVowels = false;
        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");
        for (int i=0; i<vowels.size(); i++) {
            if (word.contains(vowels.get(i))) {
                isItConsistOfVowels = true;
                break;
            }
        }
        return isItConsistOfVowels;
    }
}
