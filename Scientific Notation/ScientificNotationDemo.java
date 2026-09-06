public class ScientificNotationDemo {

    public static void main(String[] args) {

        float normalValue = 3147.456F;
        float positiveExponent = 3.147456e+3F;
        float exponentWithoutPlus = 3.147456e3F;
        float negativeExponent = 3.147456e-3F;

        System.out.println("Normal value: " + normalValue);
        System.out.println("Positive exponent: " + positiveExponent);
        System.out.println("Exponent without plus: " + exponentWithoutPlus);
        System.out.println("Negative exponent: " + negativeExponent);

        double lowercaseE = 2.5e3;
        double uppercaseE = 2.5E3;

        System.out.println("Using lowercase e: " + lowercaseE);
        System.out.println("Using uppercase E: " + uppercaseE);
    }
}