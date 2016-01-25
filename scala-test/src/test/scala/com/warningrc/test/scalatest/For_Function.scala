package com.warningrc.test.scalatest

import scala.collection.mutable.ArrayBuffer

object For_Function {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 2; j <- 1 to 2 if i != j) {
      println(100 * i + j)
    }

    def add(i: Int): Int = i + 100
    println(add(1))
    val add1 = (i: Int) => i + 200
    println(add1(1))
    def add2 = (i: Int) => i + 200
    println(add2(1))
    def add3(i: Int) = i + 100
    println(add3(1))
    def add4(is: Int*) = is.sum
    println(add4(1, 2, 3, 4, 5, 6, 7, 8, 9))
  }
}