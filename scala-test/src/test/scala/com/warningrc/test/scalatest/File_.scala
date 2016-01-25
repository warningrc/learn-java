package com.warningrc.test.scalatest

import scala.io.Source

object File_ {
  def main(args: Array[String]): Unit = {
    val file = Source.fromFile("./pom.xml")
    for (line <- file.getLines()) {
      println(line)
    }
  }
}