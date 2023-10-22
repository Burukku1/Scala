object Main4 {
  def main(args: Array[String]): Unit = {
    val text = "A big round ball fall to the ground"
    val words = text.split("\\s+")  // \\s+ - one or more spaces
    val reversedText = words.reverse.mkString(" ")
    println(reversedText)
  }
}
