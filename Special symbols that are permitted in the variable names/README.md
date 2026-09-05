# Special Symbols Permitted in Variable Names and Numeric Literals

## 1. Special Symbols Permitted in Variable Names

Two special symbols are permitted in Java variable names:

- Dollar symbol (`$`)
- Underscore (`_`)

These symbols can appear at the beginning, middle, or end of a variable name.

### Examples Using the Dollar Symbol

```java
int temp = 10;
int temp$ = 20;
int $temp = 30;
int te$mp = 40;
int te$$mp = 50;
int $ = 110;
int $$ = 120;
```

### Examples Using the Underscore

```java
int temp_ = 60;
int _temp = 70;
int te_mp = 80;
int te__mp = 90;
```

### Using Both Symbols

```java
int te_$mp = 100;
```

### Important Note

From Java 9 onwards, a single underscore cannot be used as a variable name.

```java
int _ = 130; // Compilation error in Java 9 and later
```

However, an underscore combined with other characters is permitted.

---

## 2. Special Symbols Permitted in Integer and Real Number Literals

The underscore (`_`) is permitted between the digits of integer and real-number literals.

Any number of underscores can be placed between digits.

### Valid Integer Literals

```java
int a = 10;
int b = 1_0;
int c = 1__0;
int d = 1_____0;
```

All these variables contain the value `10`.

### Valid Floating-Point Literals

```java
float g = 33.147F;
float h = 33.1_47F;
```

Both values represent `33.147`.

### Valid Hexadecimal Literal

```java
int k = 0x45;
```

The hexadecimal value `0x45` is equal to decimal value `69`.

---

## Rules for Using Underscores in Numeric Literals

An underscore must appear only between digits.

It cannot be placed:

- At the beginning of a number
- At the end of a number
- Immediately before or after a decimal point
- Between `0` and `x` in a hexadecimal literal
- Immediately after `0x`
- Immediately before or after the `F` suffix

### Invalid Examples

```java
int e = _10;
int f = 10_;

float i = 33_.147F;
float j = 33._147F;

int l = 0_x45;
int m = 0x_45;

float o = 33.147_F;
float p = 33.147F_;
```

All the above statements produce compilation errors.