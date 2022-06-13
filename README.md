# Changes in Java 17

Some simple examples of:

* Text Blocks
* instanceof pattern matching
* Switch expressions (Java 17 preview)
* Records
* Sealed classes

## JEP list - changes from 11 to 17

https://openjdk.java.net/projects/jdk/17/jeps-since-jdk-11

## Text Blocks

[TextBlockTest](src/test/java/com/itera/java17/TextBlockTest.java)

* Multiline strings
* Common (on every line) leading space/indent ignored

### Extra bits:

#### Suppress line break at end of line

```java
String literal = "Lorem ipsum dolor sit amet, consectetur adipiscing " +
                 "elit, sed do eiusmod tempor incididunt ut labore " +
                 "et dolore magna aliqua.";
```

```java
String text = """
Lorem ipsum dolor sit amet, consectetur adipiscing \
elit, sed do eiusmod tempor incididunt ut labore \
et dolore magna aliqua.\
""";
```

#### Space at end of line

Similarly, \s can be used to force a space at end of line

#### Interpolation

A text block is just a normal java String - so there is no inbuilt interpolation.
You can use String.format() or formatted():

```java
"""
Foo: %s
""".formatted(strVar)
```

## instanceof pattern matching

[InstanceOfPatternMatchingTest](src/test/java/com/itera/java17/InstanceOfPatternMatchingTest.java) and
[IntPair](src/main/java/com/itera/java17/IntPair.java)

```java
if (o instanceof X) {
  X x = (X)o;
}
```

->

```java
if (o instanceof X x) {
    // Can use x here
}
```

or even

```java
if (o instanceof X x && x.someGetter() > someValue) {
}
```

## Switch Expressions

[SwitchExpressionTest](src/test/java/com/itera/java17/SwitchExpressionTest.java) and
[ToString](src/main/java/com/itera/java17/ToString.java)

JDK 17 has switch expressions in release and also has pattern matching for switch in preview

* Switch gets new syntax (arrow notation) that makes it an expression rather than a statement
* Switch expression can therefore return a value
* When using expression syntax there is no fallthrough to the next case.
* Switch expression and can use pattern match (this is in preview) on the case section

## Records

[RecordTest](src/test/java/com/itera/java17/RecordTest.java)

Immutable data classes with default getters, toString, equals and hash code methods.


### Notes:

*  Cannot be extended
*  Can implement interfaces
*  Values are immutable - and cannot be changed
*  Default constructor/toString/equals/hashcode can be overridden
*  Can have other methods on the object - as long as they do not change the values
*  Cannot have other instance variables
*  Very similar to Lombok @Value - except that you cannot override the finality with @NonFinal

## Sealed classes

[SealedTest](src/test/java/com/itera/java17/SealedTest.java),
[beforesealed](src/main/java/com/itera/java17/beforesealed) and
[sealed](src/main/java/com/itera/java17/sealed)

Keywords:

* final
* sealed
* non-sealed
* permits

