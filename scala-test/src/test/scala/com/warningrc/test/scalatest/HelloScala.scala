package com.warningrc.test.scalatest

import java.io.IOException

object HelloScala {
  def main(args: Array[String]) {
    println("hello scala!")
    try {
      throw new RuntimeException("runtime");
    } catch {
      case t: IOException => println(t.getMessage)
      case t: RuntimeException => println(t.getMessage)
      case t: Exception => println(t.getMessage)
    }
  }
}