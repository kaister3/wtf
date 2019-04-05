import com.atomicscala.AtomicTest._

object CheckTruth{
  def main(args: Array[String]): Unit = {
    checkTruth(true || false, true) is "Both are true"

  }

  def checkTruth(exp1:Boolean, exp2:Boolean):String = {
    (exp1, exp2) match {
      case (true, true) => "Both are true"
      case (true, false) => "first:true, second:false"
      case (false, true) => "first:false, second:true"
      case (false, false) => "Both are false"
    }
  }
}
