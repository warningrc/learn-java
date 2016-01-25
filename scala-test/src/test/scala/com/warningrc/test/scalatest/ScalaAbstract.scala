package com.warningrc.test.scalatest

abstract class SuperTeacher(var name: String) {
    var id: Int
    var age: Int
    def teach
}

class TeacherForMaths(name: String) extends SuperTeacher(name) {
    override var id: Int = name.hashCode()
    override var age: Int = 0
    override def teach = println(name + " teach @ " + age)
}

object ScalaAbstract {
    def main(args: Array[String]): Unit = {
        var teacher = new TeacherForMaths("warning")
        teacher.age = 29
        teacher.teach
    }
}