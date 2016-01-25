package com.warningrc.test.scalatest

import scala.io.Source
import java.io.PrintWriter
import java.io.File
import scala.io.StdIn

object ScalaFile {
    def main(args: Array[String]): Unit = {
        var file = Source.fromFile("./pom.xml", "utf-8")
        for (line <- file.getLines()) {
            println(line)
        }
        file.close()

        val netFile = Source.fromURL("http://www.baidu.com")
        val tempFile = File.createTempFile("" + System.currentTimeMillis(), ".temp");
        println(tempFile.getAbsolutePath)
        val write = new PrintWriter(tempFile)
        netFile.foreach(write.print)
        netFile.close
        write.close()

        file = Source.fromFile(tempFile)
        for (line <- file.getLines()) println(line)
        file.close
        tempFile.delete

        //        val line = StdIn.readLine
        //        println(line)
    }
}
