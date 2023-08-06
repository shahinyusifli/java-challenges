public class Task5 {
    private static boolean checkTwoValueInGoldenRatio(double number1,double number2) {

        boolean valuesAreInGoldenRatio = false;
        double goldenRatio1 = 0;
        double goldenRatio2 = 0;
        double phi = (1 + Math.sqrt(5)) / 2;

        String formatedGaoldenRatio1;
        String formatedGaoldenRatio2;
        String formatedPhi = String.format("%.3f", phi);

        if (number1 > number2) {
            goldenRatio1 = number1/number2;
            goldenRatio2 = (number1+number2)/number1;
            System.out.println("goldenRatio1: "+ goldenRatio1);
            System.out.println("goldenRatio2: "+ goldenRatio2);
        }
        else {
            goldenRatio1 = number2/number1;
            goldenRatio2 = (number1+number2)/number2;
        }

        formatedGaoldenRatio1 = String.format("%.3f", goldenRatio1);
        formatedGaoldenRatio2 = String.format("%.3f", goldenRatio2);
        System.out.println("formatedGoldenRatio1: "+ formatedGaoldenRatio1);
        System.out.println("formatedGoldenRatio2: "+ formatedGaoldenRatio2);
        if (formatedGaoldenRatio1.equals(formatedGaoldenRatio2) && formatedGaoldenRatio1.equals(formatedPhi)) {
            valuesAreInGoldenRatio=true;
        }

        return valuesAreInGoldenRatio;
    }
}
