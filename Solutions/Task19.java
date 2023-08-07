import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Task19 {

    static public Set<Character> getDistinctValues(String word) {
        Set<Character> distinctValues = new HashSet<>();

        for (int i=0; i<word.length(); i++) {
            distinctValues.add(word.charAt(i));
        }

        return distinctValues;
    }

}
