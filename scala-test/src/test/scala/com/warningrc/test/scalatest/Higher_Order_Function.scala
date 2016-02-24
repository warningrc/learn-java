package com.warningrc.test.scalatest

/**
  * Created by warning on 2016/2/24.
  */
object Higher_Order_Function {
  def main(args: Array[String]): Unit = {
    "this is a scala app".split(" ").sortWith(_.length < _.length).foreach(println)
    println(Math.ceil(3.14))

    val fun = (x: Double) => x * 3
    println(fun(2))


    def higher_order_fun(f: (Double => Double)) = f(0.25)
    println(higher_order_fun(Math.ceil _))
    println(higher_order_fun(Math.sqrt))
    println(higher_order_fun(3 * _))
    println(higher_order_fun((x) => 2 * x))
    println(higher_order_fun((x: Double) => 4 * x))

    def addFun(x: String) = (y: String) => x + ":" + y
    val xadd = addFun("one")
    println(xadd("two"))

    val fun2 = 10 * (_: Double)
    println(fun2(2))

    def fun3: (Double => Double) = 11 * _
    println(fun3(11))

    def fun4: (Double, Double) => Double = _ * _
    println(fun4(12, 34))
  }
}
