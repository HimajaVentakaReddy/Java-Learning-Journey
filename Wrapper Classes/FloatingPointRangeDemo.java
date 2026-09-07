public class FloatingPointRangeDemo {

    public static void main(String[] args) {

        System.out.println("FLOAT RANGE");
        System.out.println("Lowest finite float: " + (-Float.MAX_VALUE));
        System.out.println("Highest finite float: " + Float.MAX_VALUE);
        System.out.println("Smallest positive float: " + Float.MIN_VALUE);

        System.out.println("\nDOUBLE RANGE");
        System.out.println("Lowest finite double: " + (-Double.MAX_VALUE));
        System.out.println("Highest finite double: " + Double.MAX_VALUE);
        System.out.println("Smallest positive double: " + Double.MIN_VALUE);

        System.out.println("\nAPPROXIMATE RANGES");
        System.out.println("float: -3.4028235E38 to 3.4028235E38");
        System.out.println("double: -1.7976931348623157E308 to 1.7976931348623157E308");
    }
}