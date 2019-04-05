import com.atomicscala.AtomicTest._

object ClassArg {
  class ClassArg(a:Int, b:Int*) {
    def f():Int = {a * 10}
    def size():Int = {
      var total = 0
      for (i <- b) {
        total += 1
      }
      total
    }
  }

  def main(args: Array[String]): Unit = {
    val ca = new ClassArg(19, 1, 2, 3,  4, 5,6)
    ca.size() is 6
  }
}
