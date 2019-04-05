object MatchExpressions {
  def main(args: Array[String]): Unit = {
    println(matchColor("white"))
  }

  def matchColor(color:String):String = color match {
    case "red" => "RED"
    case "blue" => "BLUE"
    case "green" => "GREEN"
    case _ => "UNKNOWN COLOR:" + color
  }
}
