object Main6 {
  def main(args: Array[String]): Unit = {
    val text = "Hello to everybody"
    val words = text.split("\\s+")
    val doubledWords = words.map(word => word.map(char => s"$char$char").mkString(""))
    val resultText = doubledWords.mkString(" ")
    println(resultText)
  }
}
