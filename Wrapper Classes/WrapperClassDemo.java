public class WrapperClassDemo {

    public static void main(String[] args) {

        // Primitive values
        char characterValue = 'x';
        byte byteValue = 10;
        short shortValue = 20;
        int integerValue = 30;
        long longValue = 40L;
        float floatValue = 3.147F;
        double doubleValue = 33.3384;
        boolean booleanValue = true;

        // Converting primitives into wrapper objects using valueOf()
        Character characterObject = Character.valueOf(characterValue);
        Byte byteObject = Byte.valueOf(byteValue);
        Short shortObject = Short.valueOf(shortValue);
        Integer integerObject = Integer.valueOf(integerValue);
        Long longObject = Long.valueOf(longValue);
        Float floatObject = Float.valueOf(floatValue);
        Double doubleObject = Double.valueOf(doubleValue);
        Boolean booleanObject = Boolean.valueOf(booleanValue);

        System.out.println("WRAPPER CLASS OBJECTS");
        System.out.println("Character: " + characterObject);
        System.out.println("Byte: " + byteObject);
        System.out.println("Short: " + shortObject);
        System.out.println("Integer: " + integerObject);
        System.out.println("Long: " + longObject);
        System.out.println("Float: " + floatObject);
        System.out.println("Double: " + doubleObject);
        System.out.println("Boolean: " + booleanObject);

        // Autoboxing
        Integer boxedNumber = integerValue;

        // Unboxing
        int unboxedNumber = boxedNumber;

        System.out.println("\nAutoboxed value: " + boxedNumber);
        System.out.println("Unboxed value: " + unboxedNumber);
    }
}