package com.warningrc.test.scalatest

/**
  * Created by warning on 2016/1/27.
  */
object PartialAppliedFunction {
  def main(args: Array[String]) {
    val array = Array(1, 2, 3, 4, 5, 6)
    array.foreach(println _)

    def sum(x: Int, y: Int, z: Int): Int = x + y + z

    println(sum(1, 2, 3))

    val sum_a = sum _

  }
}
