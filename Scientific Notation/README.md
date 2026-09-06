# Scientific Notation of Real Numbers in Java

Scientific notation provides a compact way to represent very large or very small real numbers.

Java uses `e` or `E` to represent powers of 10.

## Syntax

```text
number e exponent
```

It represents:

```text
number × 10^exponent
```

## Positive Exponent

```java
float a = 3.147456e+3F;
```

Calculation:

```text
3.147456 × 10³ = 3147.456
```

The plus symbol is optional:

```java
float b = 3.147456e3F;
```

## Negative Exponent

```java
float c = 3.147456e-3F;
```

Calculation:

```text
3.147456 × 10⁻³ = 0.003147456
```

## Valid Examples

```java
float a = 3147.456F;
float b = 3.147456e+3F;
float c = 3.147456e3F;
float d = 3.147456e-3F;
```

Both lowercase `e` and uppercase `E` are permitted:

```java
double firstValue = 2.5e3;
double secondValue = 2.5E3;
```

Both values represent `2500.0`.