package com.warningrc.test.scalatest

import scala.beans.BeanProperty

class University(@BeanProperty var id: Int = University.nextId) {
}

object University {
    println("==========")
    var id: Int = 0

    def nextId = {
        id += 1;
        id
    }
}

object ScalaObject {
    def main(args: Array[String]): Unit = {
        println(University.getClass)
        println(University.nextId)
        println(University.nextId)
        println(University.nextId)

        val array = Array(1, 2, 3, 4, 5)

    }
}