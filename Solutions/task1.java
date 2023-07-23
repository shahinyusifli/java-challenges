public class task1 {
    //Reverse int
    private static int reverseNumber(int number, int reversedNumber){

        if (number == 0){
            System.out.println(reversedNumber);
            return reversedNumber;
        }
        int lastNumber = number%10;
        int withoutLastNumber = number/10;
        int reversedNumberAfterCal = (reversedNumber*10)+lastNumber;

        return reverseNumber(withoutLastNumber, reversedNumberAfterCal);
    }

    private static boolean checkNumberPolindrome(int orginalNumber){

        int polindromeSuspectedNum = reverseNumber(orginalNumber, 0);

        boolean itIsPolindrome = false;
        if (orginalNumber == polindromeSuspectedNum) {
            itIsPolindrome = true;
        }

        return itIsPolindrome;
    }
}
