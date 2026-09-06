# Default Values of Primitive Data Types in Java

Java automatically assigns default values to instance variables and static variables when they are declared without initialization.

## Default Values

| Primitive data type | Default value |
|---|---|
| `byte` | `0` |
| `short` | `0` |
| `int` | `0` |
| `long` | `0L` |
| `float` | `0.0F` |
| `double` | `0.0D` |
| `char` | `'\u0000'` |
| `boolean` | `false` |

## Example

```java
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
```

When an `Employee` object is created, Java automatically assigns default values to these instance variables.

```java
Employee employee = new Employee();

System.out.println(employee.initial);
System.out.println(employee.age);
System.out.println(employee.salary);
System.out.println(employee.carEMI);
System.out.println(employee.expectedSalary);
System.out.println(employee.height);
System.out.println(employee.weight);
System.out.println(employee.isMarried);
```

## Important Note

Default values are assigned only to:

- Instance variables
- Static variables
- Array elements

Local variables do not receive default values. They must be initialized before they are used.

```java
public static void main(String[] args) {

    int number;

    // System.out.println(number);
    // Compilation error because number is not initialized
}
```

The default `char` value is the null character `'\u0000'`, which normally appears blank when printed.