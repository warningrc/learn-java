package com.warningrc.test.scalatest

object ScalaTestTest {
    def main(args: Array[String]): Unit = {
        (1 to 9).map("*" * _).foreach(println(_))
        (1 until 8).filter(_ % 2 == 0).foreach { println _ }
        println((1 to 9).reduceLeft(_ * _))


    }
}