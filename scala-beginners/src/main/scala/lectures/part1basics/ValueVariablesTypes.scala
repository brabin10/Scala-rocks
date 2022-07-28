package lectures.part1basics

object ValueVariablesTypes extends App{

  val x = 50
  println(x)

  //vals are immutable
  //Compiler can infer types

  val aString: String = "hello"
  val anotherString = "goodbye"
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4544
  val aLong: Long = 42489217489194L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.15

  // variables
  var aVariable: Int = 4

  aVariable = 5 // side effects

}
