# Robotics Coding: Lesson 1
[Last Lesson](https://github.com/pymblelc/robotics-coding-0)
|
[Next Lesson](https://github.com/pymblelc/robotics-coding-2)

## Overview
The lesson goes over the initial basics of java that you'll need to know for robotics.


## Lab 1: Variables and Types
[Click here to open the lab](./app/src/main/java/lesson1/labs/Lab1.java)

In programming, we often need to store information that we want to reuse or change over time. We do this by using variables.

Variables can have different types depending on what they are used for. Things like numbers, text, switches, are defined as different things in code with slightly different names.

### Strings
Strings are a type of variable that can hold text. They are defined with double `"` or single `'` quotes.

Let's say we wanted to store our favorite color. We can do it like this in Java:

```java
String favouriteColour = "Red";
```

We start the line with the keyword `String` to tell the computer that this is going to be a piece of text. We then give the variable a name/way to identify it (`favouriteColour`). We then tell the computer to store our text with the `=` symbol, followed by the text we want to store.

### Integers
Integers are a type of variable that can hold whole numbers. They are defined with the `Integer` keyword.

Let's say we wanted to store the number of years we have been coding. We can do it like this in Java:

```java
Integer yearsCoding = 5;
```

Again like last time, we start the line with the keyword `Integer` to tell the computer that this is going to be an `Integer` (a whole number). We then give the variable a name/way to identify it (`yearsCoding`). We then tell the computer to store our number with the `=` symbol, followed by the number we want to store.

### Doubles
Doubles are a type of variable that can hold decimal numbers. They are defined with the `Double` keyword.

Let's say we wanted to store how much money we have in our bank account. We can do it like this in Java:

```java
Double bankAccount = 32.64;
```

### Booleans
Booleans are a type of variable that can hold true or false. They are defined with the `Boolean` keyword. They act like a light switch. If it is `true`, then the light is on. If it is `false`, then the light is off.

Let's say we wanted store if a coin is heads or tails. We can do it like this in Java:

```java
Boolean coinIsHeads = true;
```

In this example, we can use `true` or `false` to tell the computer if the coin is heads or tails. `true` means the coin is heads, and `false` means the coin is tails.