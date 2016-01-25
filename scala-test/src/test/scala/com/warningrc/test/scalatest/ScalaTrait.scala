package com.warningrc.test.scalatest

trait Logger {
    def log(msg: String) {
        println("Logger:" + msg)
    }
}

class ConcreteLogger extends Logger with Cloneable with Runnable {
    override def log(msg: String) = println("ConcreteLogger:" + msg)

    override def run() = {
        log("it is run!")
    }
}

class TestLogger extends Logger with Cloneable with Runnable {
    override def log(msg: String) = println("TestLogger : " + msg)

    override def run() = {
        log("it is run!")
    }
}

trait TraitLogger extends Logger {
    override def log(msg: String) = println("TraitLogger : " + msg)
}

class Human {
    println("Human")
}

trait TTecher extends Human {
    println("TTeacher")

    def teach
}

trait PianoPlayer extends Human {
    println("PianoPlayer")

    def playPiano = println("i'm playing piano.")
}

class PianoTeacher extends Human with TTecher with PianoPlayer {
    override def teach: Unit = {
        println("i'm training students.")
    }
}

// AOP

trait Action {
    def doAction
}

trait TBeforeAfter extends Action {
    abstract override def doAction = {
        println("initialization")
        println(super.getClass)
        super.doAction
        println("destroyed")
    }
}

class Work extends Action {
    def doAction = println("working...")
}

object ScalaTrait {
    def main(args: Array[String]): Unit = {
        val log = new ConcreteLogger
        log.run

        var logger = new TestLogger
        logger.run()

        logger = new TestLogger with TraitLogger
        logger.run()

        val teacher = new PianoTeacher
        teacher.teach
        teacher.playPiano
        println(teacher.getClass)

        val work = new Work with TBeforeAfter
        println(work.getClass)
        work.doAction
    }
}