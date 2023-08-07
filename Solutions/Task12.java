import java.util.ArrayList;

public class Task12 {
    private static void printHalfPiramide() {

        ArrayList<String> emptyHalfString = new ArrayList<String>();
        for(int i=0; i<11; i++) {
            emptyHalfString.add(" ");
        }


        for(int i=0; i<emptyHalfString.size()/2+1; i++) {
            if(i==0) {
                emptyHalfString.set(emptyHalfString.size()/2, "*");
                System.out.println(emptyHalfString.toString());
            }
            else {
                emptyHalfString.set(emptyHalfString.size()/2+i, "*");
                emptyHalfString.set(emptyHalfString.size()/2-i, "*");
                System.out.println(emptyHalfString.toString());
            }
        }
    }

    public static void printPatterns(int rows) {

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
