public class TypeCastingDemo {

    public static void main(String[] args) {

        System.out.println("IMPLICIT TYPE CASTING");

        // Example 1: byte to short
        byte byteValue = 10;
        short shortValue = byteValue;

        System.out.println("Byte value: " + byteValue);
        System.out.println("Converted short value: " + shortValue);

        // Example 2: int to double
        int intValue = 20;
        double doubleValue = intValue;

        System.out.println("Integer value: " + intValue);
        System.out.println("Converted double value: " + doubleValue);

        System.out.println("\nEXPLICIT TYPE CASTING");

        // Example 3: int to short
        int largerInteger = 40;

        // short smallerShort = largerInteger; // Compilation error
        short smallerShort = (short) largerInteger;

        System.out.println("Integer value: " + largerInteger);
        System.out.println("Converted short value: " + smallerShort);

        // Example 4: double to short
        double decimalValue = 2.2;

        // short result = decimalValue; // Compilation error
        short result = (short) decimalValue;

        System.out.println("Double value: " + decimalValue);
        System.out.println("Converted short value: " + result);
    }
}