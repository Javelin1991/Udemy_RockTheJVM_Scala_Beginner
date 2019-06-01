package lectures.part2oop

import playground.{Cindrella, PrinceCharming}

import java.util.Date
import java.sql.{Date => SqlDate}

object PackagingAndImports extends App {

  // package members are accesible by their simple name
  val writer = new Writer("Daniel", "RockTheJVM", 2018)

  // import that package
  val princess = new playground.Cindrella // fully qualified name

  // packages are in hierarchy
  // matching folder structure

  // package object
  sayHello
  println(SPEED_OF_LIGHT)

  // imports
  val prince = new PrinceCharming

  // 1. use Fully Qualified names
  val date = new Date
  val sqlDate = new java.sql.Date(2018, 5, 4)
  // 2. use aliasing
  //  val sqlDate = new SqlDate(2018, 5, 4)

  // default imports
  // java.lang - String, Object, Exception
  // scala - Int, Nothing, Function
  // scala.Predef - println, ???

}
