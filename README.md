# NumberFormatException in Scala Implicit Constructor

This example demonstrates a common error in Scala related to implicit constructors and the handling of potential exceptions.  The problem arises when a string that cannot be converted to an integer is passed to the implicit constructor.

## Issue Description:

The `MyClass` class has two constructors.  The primary constructor takes an integer.  An auxiliary constructor takes a string and attempts to convert it to an integer using `toInt`.  If the string is not a valid integer representation, this results in a `NumberFormatException`.

## Solution:

The solution involves handling the potential exception.  This can be done with a `try-catch` block.