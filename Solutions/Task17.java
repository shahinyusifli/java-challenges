import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task17 {
    static public boolean compareTwoStrings(String word) {
        boolean itContainsNumber = false;
        List<Integer> naturalNumbers = IntStream.rangeClosed(0, 9).boxed().collect(Collectors.toList());
        for(int i=0; i<naturalNumbers.size(); i++) {
            if(word.contains(String.valueOf(naturalNumbers.get(i)))){
                itContainsNumber = true;
                break;
            }
        }

        return itContainsNumber;
    }
}
