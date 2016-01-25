package com.warningrc.test.scalatest

package spark {
    package navigetion {

        trait Action {
            def doAction
        }

        package tests {
            class ActionTest {

            }
        }
    }

}
package scalatest {
    package object test {
        def defaultName = "scala"
    }

    package test {
        package people {
            class People {
                var name = defaultName
            }
        }
        class People {
            var name = defaultName
        }
    }
}
object ScalaPackage {

}
