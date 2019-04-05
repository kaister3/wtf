import com.atomicscala.AtomicTest._
//import Square._

object GardenGnome {
  class GardenGnome(val height:Double,
                    val weight:Double,
                    val happy:Boolean) {
    println("Inside primary constructor")
    var painted = true
    def magic(level:Int):String = {
      "Poof!" + level
    }
    def this(height:Double) {
      this(height, 100.0, true)
    }
    def this(name:String) {
      this(15.0)
      painted = true
    }
    def show():String = {
      height + " " + weight + " " + happy + " " + painted
    }
    def show(level:Int):String = {
      magic(level) + happy + painted
    }
  }

  def main(args: Array[String]): Unit = {
    new GardenGnome(20.0, 110.0, false).show() is "20.0 110.0 false true"
  }
}
