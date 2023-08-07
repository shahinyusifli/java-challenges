public class Task15 {
    private static String checkIsItPrimeNumber(int number) {
        if(number == 2) {
            return "It is prime number";
        }
        else {
            String isItPrimerNumber = number % 2 == 0
                    ? "It is not prime number"
                    : "It is prime number";
            return isItPrimerNumber;
        }
    }
}
