# Robotics Coding: Lesson 1
[Last Lesson](https://github.com/pymblelc/robotics-coding-0)
|
[Next Lesson](https://github.com/pymblelc/robotics-coding-2)

## Overview
The lesson goes over the initial basics of java that you'll need to know for robotics.

## Preface
Before we start getting into labs, we'll go over some of the basics of java. Things like comments and the general structure of the file.

### Comments
Comments are lines in the code that do nothing but tell the programmer what the code is doing. This way you can leave yourself and others notes to document and explain your code.

To write a comment in java, we start the line with a `//` and then write whatever comments/notes we want. We can also use `/*` and `*/` to comment out more specific sections of code.

```java
PretendCode here // Everything after "//" is a comment

MorePretendCode here /* Comment inside here */ back to code

/*
This is
a multiline
comment
*/
```

When trying to solve a problem in code, it can help to first write comments of what you want to do, and then code beneath each comment. This way you can better understand what you're trying to do and leave notes for others to read.

### Structure
Java files are organised into classes with code inside of them. We'll get into more details of what classes are in later lessons, but for now we'll just explain where you'll be inserting code.

```java
package example; // Don't worry about this yet
import some.example.robot; // Don't worry about this yet

//By the end of this lesson, you should be able to fully understand the code below.
public class MyClass {
    // A class is just a collection of code. We won't worry about exactly what a class is, but just know, you'll always need one to put code into.

    String today = "Monday";

    public void main() {
        System.out.println("Hello World!");
        System.out.println("Today is " + today);
    }
}
```

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

## Lab 2: Functions and Returns
TODO

## Lab 3: Conditions (`if | else`)
TODO

## Lab 4: Loops (`for | while`)
TODO