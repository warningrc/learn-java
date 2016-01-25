package com.warningrc.test.scala

import scala.collection.mutable.ArrayBuffer
object ScalaAction {
  val array = Array(1, 2, 3, 4, 5)                //> array  : Array[Int] = Array(1, 2, 3, 4, 5)
  for (i <- array) println(i)                     //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
  var ss = new Array[String](2)                   //> ss  : Array[String] = Array(null, null)
  var is = new Array[Int](2)                      //> is  : Array[Int] = Array(0, 0)
  var ib = ArrayBuffer[Int]()                     //> ib  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
  ib += 1                                         //> res0: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1)
  ib ++= Array(2)                                 //> res1: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2)
  ib ++= Array(3)                                 //> res2: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3)

  for (i <- 0 until ib.length) {
    println(ib(i))
    println(ib(i))//> 1
                                                  //| 2
                                                  //| 3
  }

  for (i <- ib) yield i * 2                       //> res3: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(2, 4, 6)
  for (i <- ib if i % 2 == 0) yield i * 2         //> res4: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(4)

  ib.sum                                          //> res5: Int = 6
  ib.max                                          //> res6: Int = 3
  ib.filter { _ % 2 == 0 }.map { _ * 2 }          //> res7: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(4)
  ib.filter(_ % 2 == 0).map(_ * 2)                //> res8: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(4)

  Array.ofDim[String](2, 3)                       //> res9: Array[Array[String]] = Array(Array(null, null, null), Array(null, null
                                                  //| , null))
  for((x,y)<-Array("[", "-", "]").zip(Array(2, 10, 2))) Console.print(x*y)
                                                  //> 
  
  
  
  
}