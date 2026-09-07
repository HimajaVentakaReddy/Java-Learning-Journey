# Wrapper Classes in Java

## Introduction

Java is not considered a purely object-oriented programming language because it supports primitive data types such as `int`, `char`, and `boolean`, which are not objects.

Java provides wrapper classes to represent primitive values as objects. By using wrapper classes instead of primitive data types, Java programs can work with values in object form.

## Primitive Types and Wrapper Classes

| Primitive data type | Wrapper class |
|---|---|
| `char` | `Character` |
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `boolean` | `Boolean` |

## Primitive Variable Examples

```java
char characterValue = 'x';
byte byteValue = 10;
short shortValue = 20;
int integerValue = 30;
long longValue = 40L;
float floatValue = 3.147F;
double doubleValue = 33.3384;
boolean booleanValue = true;
```

Primitive variables directly store their values.

## Creating Wrapper Objects

Wrapper objects can be created using the `valueOf()` method:

```java
Character characterObject = Character.valueOf('x');
Byte byteObject = Byte.valueOf((byte) 10);
Short shortObject = Short.valueOf((short) 20);
Integer integerObject = Integer.valueOf(30);
Long longObject = Long.valueOf(40L);
Float floatObject = Float.valueOf(3.147F);
Double doubleObject = Double.valueOf(33.3384);
Boolean booleanObject = Boolean.valueOf(true);
```

## Autoboxing

The automatic conversion of a primitive value into its corresponding wrapper object is called **autoboxing**.

```java
int number = 30;
Integer numberObject = number;
```

## Unboxing

The automatic conversion of a wrapper object into its corresponding primitive value is called **unboxing**.

```java
Integer numberObject = 30;
int number = numberObject;
```

## Important Note

Older Java code may create wrapper objects using constructors:

```java
Integer number = new Integer(30);
```

Wrapper-class constructors are deprecated in modern Java. The recommended approaches are `valueOf()` and autoboxing:

```java
Integer firstNumber = Integer.valueOf(30);
Integer secondNumber = 30;
```

## Why Wrapper Classes Are Useful

Wrapper classes are useful when:

- Working with Java collections
- Converting strings into numeric values
- Using utility methods
- Representing primitive values as objects
- Allowing `null` to represent the absence of a value