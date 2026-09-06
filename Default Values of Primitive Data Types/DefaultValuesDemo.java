class Employee {

    char initial;
    byte age;
    short salary;
    int carEMI;
    long expectedSalary;
    float height;
    double weight;
    boolean isMarried;
}

public class DefaultValuesDemo {

    public static void main(String[] args) {

        Employee employee = new Employee();

        System.out.println("Default values of primitive data types:");
        System.out.println("char: '" + employee.initial + "'");
        System.out.println("char Unicode value: " + (int) employee.initial);
        System.out.println("byte: " + employee.age);
        System.out.println("short: " + employee.salary);
        System.out.println("int: " + employee.carEMI);
        System.out.println("long: " + employee.expectedSalary);
        System.out.println("float: " + employee.height);
        System.out.println("double: " + employee.weight);
        System.out.println("boolean: " + employee.isMarried);

        /*
         * Local variables do not receive default values.
         *
         * int number;
         * System.out.println(number);
         *
         * The above code produces a compilation error because
         * the local variable number is not initialized.
         */
    }
}