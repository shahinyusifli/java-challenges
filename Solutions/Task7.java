import java.util.LinkedList;

public class Task7 {
    private static LinkedList<String> reverseList(LinkedList<String> word2) {

        LinkedList<String> reversedString = new LinkedList<>();

        for (int i=0; i<word2.size(); i++) {
            reversedString.add(word2.get(word2.size()-i-1));
        }

        return reversedString;
    }
}
