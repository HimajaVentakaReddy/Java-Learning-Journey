# Type Casting in Java

Converting data from one data type to another data type is called **type casting**.

There are two types of type casting:

1. Implicit type casting
2. Explicit type casting

## 1. Implicit Type Casting

Converting data from a smaller data type to a larger data type is called **implicit type casting**.

It is also known as:

- Type promotion
- Widening type casting
- Automatic type casting

Java performs this conversion automatically because the larger data type can store the smaller value.

### Example: `byte` to `short`

```java
byte a = 10;
short b;

b = a;

System.out.println(a); // 10
System.out.println(b); // 10
```

A `byte` occupies 1 byte, whereas a `short` occupies 2 bytes. Therefore, the conversion happens automatically.

### Example: `int` to `double`

```java
int a = 20;
double b;

b = a;

System.out.println(a); // 20
System.out.println(b); // 20.0
```

An `int` occupies 4 bytes, whereas a `double` occupies 8 bytes.

## 2. Explicit Type Casting

Converting data from a larger data type to a smaller data type is called **explicit type casting**.

It is also known as:

- Narrowing type casting
- Manual type casting

Explicit casting must be performed manually by writing the required data type inside parentheses.

### Syntax

```java
smallerVariable = (smallerDataType) largerVariable;
```

There is a possibility of losing data during explicit type casting.

### Example: `int` to `short`

```java
int a = 40;
short b;

// b = a; // Compilation error

b = (short) a;

System.out.println(a); // 40
System.out.println(b); // 40
```

### Example: `double` to `short`

```java
double a = 2.2;
short b;

// b = a; // Compilation error

b = (short) a;

System.out.println(a); // 2.2
System.out.println(b); // 2
```

The decimal part `.2` is lost when the `double` value is converted to `short`.

## Primitive Type Conversion Order

```text
byte → short → int → long → float → double
```

Moving from left to right generally performs implicit casting.

Moving from right to left requires explicit casting.