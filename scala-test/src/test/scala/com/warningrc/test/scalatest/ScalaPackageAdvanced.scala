package com.warningrc.test.scalatest

package spark {
    package navigation {
        private[spark] class Navigator {
            protected[navigation] def useStarChart(): Unit = {

            }
            class LegOfJourney {
                private[Navigator] val distance = 100
            }
            private[this] var speed = 200
        }
    }
    package launch {
        import navigation._
        object Vehicle {
            private[launch] val guide = new Navigator
        }
    }
}
class ScalaPackageAdvanced {
    import ScalaPackageAdvanced._
    private[ScalaPackageAdvanced] def canMakeItTrue = power > 10001
    private def thisName = name
}
object ScalaPackageAdvanced {
    private[ScalaPackageAdvanced] def power = 10000
    private def name = "name"

    def makeItTrue(p: ScalaPackageAdvanced): Boolean = {
        println(p.thisName)
        p.canMakeItTrue
    }
}
