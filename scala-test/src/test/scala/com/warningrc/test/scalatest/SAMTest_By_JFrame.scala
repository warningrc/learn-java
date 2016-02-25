package com.warningrc.test.scalatest

import java.awt.event.{ActionEvent, ActionListener}
import javax.swing.{JButton, JFrame}

/**
  * Created by warning on 2016/2/24.
  */
object SAMTest_By_JFrame {
  def main(args: Array[String]): Unit = {
    val frame = new JFrame("test")
    val button = new JButton("button")
    frame.setContentPane(button)
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //    button.addActionListener(new ActionListener {
    //      override def actionPerformed(e: ActionEvent): Unit = {
    //        println(System.currentTimeMillis())
    //      }
    //    })


    implicit def fun(action: ActionEvent => Unit) = new ActionListener {
      override def actionPerformed(e: ActionEvent): Unit = action(e)
    }


    //    button.addActionListener((e: ActionEvent) => println(e))
    //    button.addActionListener(fun(println _))
    button.addActionListener(fun((e) => println(e.getID)))
    frame.pack()
    frame.setVisible(true)

  }
}
