public class NumericSuffixDemo {

    public static void main(String[] args) {

        System.out.println("FLOAT LITERAL EXAMPLES");

        // float invalidFloat = 3.147; // Compilation error

        float castedFloat = (float) 3.147;
        float uppercaseFloat = 3.147F;
        float lowercaseFloat = 3.147f;

        System.out.println("Explicitly casted float: " + castedFloat);
        System.out.println("Float using F suffix: " + uppercaseFloat);
        System.out.println("Float using f suffix: " + lowercaseFloat);

        System.out.println("\nDOUBLE LITERAL EXAMPLES");

        double defaultDouble = 3.147;
        double uppercaseDouble = 3.147D;
        double lowercaseDouble = 3.147d;

        System.out.println("Default double: " + defaultDouble);
        System.out.println("Double using D suffix: " + uppercaseDouble);
        System.out.println("Double using d suffix: " + lowercaseDouble);

        System.out.println("\nLONG LITERAL EXAMPLES");

        // long invalidLong = 2147483648; // Compilation error

        long largeNumber = 2147483648L;
        long smallNumber = 32768;
        long smallNumberWithSuffix = 32768L;

        System.out.println("Large long value: " + largeNumber);
        System.out.println("Small integer stored in long: " + smallNumber);
        System.out.println("Long using L suffix: " + smallNumberWithSuffix);
    }
}