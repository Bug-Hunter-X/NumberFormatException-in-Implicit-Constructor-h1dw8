```scala
class MyClass(val value: Int) {
  def this(s: String) = this(s.toInt)
}

val myObject = new MyClass("abc")
```