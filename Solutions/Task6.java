import java.text.DecimalFormat;

public class Task6 {
    private static double printPosibleMultiples(double number, double diffValue, double phi) {

        final DecimalFormat decfor = new DecimalFormat("0.0");
        String formatedPhi = decfor.format(phi);
        if (number == 0.0) {
            return 0;
        }
        double[] orginalArray = new double[2];
        orginalArray[0] = number;
        orginalArray[1] = diffValue - number;
        double calculation = orginalArray[0]/orginalArray[1];
        String formatedCalculation = decfor.format(calculation);


        System.out.println("Total: "+ formatedCalculation);
        System.out.println("First number: " + orginalArray[0]);
        System.out.println("Second number: " + orginalArray[1]);
        System.out.println(" ");
        if (formatedPhi.equals(formatedCalculation)){
            System.out.println("First number: " + orginalArray[0]);
            System.out.println("Second number: " + orginalArray[1]);
        }
        else {


            printPosibleMultiples((number - 0.5), diffValue, phi);
        }


        return orginalArray[0];
    }
}
