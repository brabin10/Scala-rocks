package lectures.part1basics

object Expressions extends App{

  val x = 1 + 2 // Expression
  println(x)

  println( 2 + 3 * 5)
  // + - * / & | ^ << >> >>> (right sift with zero extension)

  println( 1== x)
  // == != > >= < <=

  println(!(1 == x)
    // ! && \\

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ....side effects
  println(aVariable)

  //Instructions (DO) vs Expression (VALUE)

  //IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 //IF expression
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

}
