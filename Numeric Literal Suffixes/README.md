# Numeric Literal Suffixes in Java

Java provides suffixes to specify the data type of numeric literals.

## Float Suffix

By default, a real-number literal is treated as a `double`.

Therefore, assigning a decimal literal directly to a `float` variable produces a compilation error.

```java
float a = 3.147; // Compilation error
```

To store the value in a `float`, we can:

### 1. Use Explicit Type Casting

```java
float b = (float) 3.147;
```

### 2. Add the `F` Suffix

```java
float c = 3.147F;
```

Both uppercase `F` and lowercase `f` are permitted:

```java
float firstValue = 3.147F;
float secondValue = 3.147f;
```

## Double Suffix

Decimal literals are treated as `double` by default, so adding a suffix is optional.

```java
double a = 3.147;
double b = 3.147D;
double c = 3.147d;
```

## Long Suffix

Integer literals are treated as `int` by default when their values are within the `int` range.

A value larger than the maximum `int` value must use the `L` suffix to be stored as a `long`.

```java
long a = 2147483648;  // Compilation error
long b = 2147483648L; // Valid
```

A smaller integer literal can be assigned to a `long` variable automatically:

```java
long c = 32768;
long d = 32768L;
```

Both uppercase `L` and lowercase `l` are valid, but uppercase `L` is recommended because lowercase `l` resembles the number `1`.

## Common Numeric Suffixes

| Suffix | Data type | Example |
|---|---|---|
| `F` or `f` | `float` | `3.147F` |
| `D` or `d` | `double` | `3.147D` |
| `L` or `l` | `long` | `2147483648L` |