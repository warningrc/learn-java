package com.warningrc.test.scalatest

object ScalaRegex {
    def main(args: Array[String]): Unit = {
        val regex = """([0-9]+) ([a-z]+)""".r
        val numPattern = "[0-9]+".r
        val numberPattern = """\s+[0-9]+\s+""".r

        for (matchString <- numPattern.findAllIn("8989 scala, 6789 spark")) println(matchString)
        println(numberPattern.findFirstIn("8989 scala, 6789 spark"))

        val numitemPattern = """([0-9]+) ([a-z]+)""".r

        val numitemPattern(num, item) = "999 hadoop"

        println(num + "====" + item)

        val line = "431341 spark"

        line match {
            case numitemPattern(num, blog) => println(num + "===" + blog)
            case _ => println("ohh...")
        }
    }
}