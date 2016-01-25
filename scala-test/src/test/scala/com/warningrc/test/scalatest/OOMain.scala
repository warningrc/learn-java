package com.warningrc.test.scalatest

import scala.beans.BeanProperty

class User {
  private[this] var age = 0
  def increment() { age += 1 }
  def current = age
  def isYounger(other: User) = age < other.current
}
class Dept {
  var name = "dept"
}
class Teacher {
  @BeanProperty var name: String = _
  def this(nane: String) {
    this
    this.name = name
  }
}

class Student /*protected*/ (id: Int, var name: String,
    /*protected*/ private var age: Int, val sex: Int,
    @BeanProperty var address: String) {
  println("这是主构造器")
  def this(name: String, age: Int) {
    this(0, name, age, 1, "北京")
    println("这是辅构造器")
  }
}

class Outer(val name: String) {
  outer =>
  class Inner(val name: String) {
    def foo(inner: Inner) = println("outer:" + outer.name + ",inner:" + inner.name)
  }
  class Inner1(val name: String) {
    def foo() = println("outer:" + outer.name + ",inner:" + name)
  }
}
object OOMain {
  def main(args: Array[String]): Unit = {
    val user = new User
    println(user.current)
    user.increment()
    println(user.current)
    user.increment()
    println(user.current)

    val dept = new Dept
    println(dept.name)
    dept.name_=("update dept")
    println(dept.name)

    val teacher = new Teacher
    println(teacher.name)

    var student = new Student(12, "warning", 25, 1, "北京")
    //    println(student.id)
    println(student.name)
    student.name = student.name + "-update"
    println(student.name)
    student.name += "--"
    println(student.name)
    //    println(student.age)
    println(student.sex)
    //    student.sex = 1
    println(student.address)
    println(student.getAddress())
    student.address += "-update"
    println(student.address)
    println(student.getAddress())
    student.setAddress(student.address + "----")
    println(student.address)
    println(student.getAddress())
    println("===========")

    student = new Student("warning", 26)

    //=======================

    val outer1 = new Outer("outer1")
    val outer2 = new Outer("outer2")
    val inner1 = new outer1.Inner("outer1.inner1")
    val inner2 = new outer2.Inner("outer1.inner2")

    inner1.foo(inner1)
    inner2.foo(inner2)
    
    new outer1.Inner1("outer1.Inner1").foo()
  }
}