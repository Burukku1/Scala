


//замена the на a
object Main3 {
  def main(args: Array[String]): Unit = {
    val text = "A big round ball fall to the ground"
    val replacedText = text.replaceAll("the", "a")
    // можно через \\bthe\\b, это будет искать имеено слово the а не часть строки the в другом слове
    println(replacedText)
  }
}
