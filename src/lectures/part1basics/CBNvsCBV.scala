package lectures.part1basics

object CBNvsCBV extends App {

  def callByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def callByName(x: => Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  def infinite() : Int = 1 + infinite()
  def printFirst(x: Int, y: => Int)= println(x)

//  printFirst(infinite(), 34)

  // Call by value:
  // value is computed before call
  // same value used everywhere

  // Call by name:
  // expression is passed literally
  // expression is evaluated at every use within
}
