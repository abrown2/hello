package example

import cases._

object Hello extends Greeting with App {

  println(greeting)
  val cabbage = Veggies("Cabbage", "bras")
  println(cabbage + " to sow in " + cabbage.monthToSow)
  val bean = Veggies("beans", "legumes")
  val sowingmonth = bean.monthToSow
  println(bean.upper("one", "two"))
//  println("hello again")
////  val greeting2: String = 1.toString + "cde"
//  println(greeting2)
  //List(1,2,3,4) foreach println

}

trait Greeting {
  lazy val greeting: String = "hello23"
}
