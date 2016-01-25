package com.warningrc.test.scalatest

class ApplyTest {
    def apply() = println("this is class ApplyTest.apply()")

    def sayHello = println("hello applyTest!")
}

object ApplyTest {
    def apply() = {
        println("this is object ApplyTest.apply()")
        new ApplyTest
    }
}

object ScalaApply {
    def main(args: Array[String]): Unit = {
        val t = ApplyTest() //调用object的apply方法
        t.sayHello
        t() // 调用类的apply方法

        val array = Array(1, 2, 3, 4, 5, 6, 7)
        println(array(1))
    }
}