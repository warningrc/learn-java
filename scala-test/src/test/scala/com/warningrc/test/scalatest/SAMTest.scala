package com.warningrc.test.scalatest

import java.io.File

import scala.io.Source

/**
  * Created by warning on 2016/2/25.
  */
object SAMTest {

  object Context {
    implicit val ccc: String = "implicit"
  }


  object Param {
    def print(content: String)(prefix: String) {
      println(prefix + ":" + content)
    }

    def print1(content: String)(implicit prefix: String) {
      println(prefix + ":" + content)
    }
  }

  def main(args: Array[String]) {
    Param.print("jack")("hello")
    val x = Param.print("jack") _
    x("你好-")

    val y = Param.print _
    y("1")("2")
    val z = y("3")
    z("4")


    import Context._
    Param.print1("jack")("hello")
    Param.print1("jack")
  }

}

object Implicit_File {

  class ReadFile(file: File) {
    def mkString: String = Source.fromFile(file).mkString
  }

  object Context {
    implicit def file2String(file: File) = new ReadFile(file)
  }

  def main(args: Array[String]) {
    import Context.file2String
    println(new File("./pom.xml").mkString)
  }

}

object Implicit_File1 {

  implicit class file2string(file: File) {
    def getString = Source.fromFile(file).mkString
  }

  def main(args: Array[String]) {
    println(new File("./pom.xml").getString)


    def until(condition: => Boolean)(block: => Unit) {
      if (!condition) {
        block
        until(condition)(block)
      }
    }

    // 使用
    var x = 10
    until(x == 0) {
      x -= 1
      println(x)
    }


    def indexOf(str: String, ch: Char): Int = {
      var i = 0
      until(i == str.length) {
        if (str(i) == ch) return i
        i += 1
      }
      return -1
    }

    println(indexOf("ABC", 'A'))
    println(indexOf("ABC", 'B'))
    println(indexOf("ABC", 'C'))

    //http://nerd-is.in/2013-09/scala-learning-higher-order-functions/
  }
}
