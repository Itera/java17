# Changes in Java 17

Some simple examples of:

* Text Blocks
* instanceof pattern matching
* Switch expressions (Java 17 preview)
* Records
* Sealed classes

## Text Blocks

[TextBlockTest](src/test/java/com/itera/java17/TextBlockTest.java)

* Multiline strings
* Common (on every line) leading space/indent ignored

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

JDK 17 has this in preview

* Switch gets new syntax and can use pattern match on the case section
* Switch statement can return a value

## Records

[RecordTest](src/test/java/com/itera/java17/RecordTest.java)

Immutable data classes with default getters, toString, equals and hash code methods.

## Sealed classes

...

## JEP overview

...

