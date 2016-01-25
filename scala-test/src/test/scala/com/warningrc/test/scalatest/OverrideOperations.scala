package com.warningrc.test.scalatest

class OverrideOperations {

}
class Person1(val name: String, var age: Int) {
    println("--------------")
    val school = "BJU"
    def sheep = "8 hours"

    override def toString = "this is a Person1"
}

class Worker(name: String, age: Int, val salary: Long) extends Person1(name, age) {
    println("===============")
    override val school = "beijing"
    override def toString = "this is a Worker." + super.sheep
}

object OverrideOperations {
    def main(args: Array[String]): Unit = {
        val w = new Worker("warning", 25, 10000)
        println(w.name)
        println(w.age)
        println(w.school)
        println(w.salary)
        println(w)
    }
}