public class Task10 {
    static public Boolean checkPalindrome(String word) {

        Boolean isItPalindrome = true;

        for (int i=0; i<word.length()/2; i++) {
            if(word.charAt(i) != word.charAt(word.length() - i -1)) {
                isItPalindrome = false;
            }
        }

        return isItPalindrome;
    }
}
