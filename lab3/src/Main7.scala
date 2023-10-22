object Main7 {
  def main(args: Array[String]): Unit = {
    val text = "Hello to everybody"
    val withoutY = text.replaceAll("y", "")
    println(withoutY)
  }
}
