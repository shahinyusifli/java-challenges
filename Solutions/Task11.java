import java.util.Arrays;

public class Task11 {
    private static void findSecondLargestElement(String word, String wantedString) {
        String trimedWord = Arrays.toString(word.trim().split("//s+"));
        String trimedString = wantedString.trim();

        if (trimedWord.contains(trimedString)) {
            System.out.println("Yes, " + trimedString + " exist in sentace");
        }
        else System.out.println(trimedString + " does not exist in sentace");

    }
}
