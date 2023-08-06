public class Task9 {
    public static int findFactorialValue(int number) {

        int factorialValue = 1;

        for (int i=1; i<number+1; i++) {
            factorialValue = factorialValue * i;
        }

        return factorialValue;
    }
}
