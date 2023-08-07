public class Task13
{
    public static String findFirstUnrepated(String word){

        String replacedString;
        String firstUnrepatedValue = "";

        for(int i=0; i<word.length(); i++) {
            replacedString = word.replaceFirst(String.valueOf(word.charAt(i)), "");
            if(!replacedString.contains(String.valueOf(word.charAt(i)))) {
                firstUnrepatedValue = String.valueOf(word.charAt(i));
                break;
            };
        }

        return firstUnrepatedValue;
    }
}
