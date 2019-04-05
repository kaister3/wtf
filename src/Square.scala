object Square{
  def main(args: Array[String]): Unit = {
    println(square(9))
  }

  def double(x:Int): Int = {
    if (x == 0){
      x
    }
    else {
      2 + double(x - 1)
    }
  }

  def square(x:Int): Int = if (x > 0) {
    square(x - 1) + double(x - 1) + 1
  }
  else 0
}
