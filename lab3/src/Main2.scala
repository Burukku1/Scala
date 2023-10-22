
//поиск слов, которые начинаются на ext
object Main2 {
  def main(args: Array[String]): Unit = {
    val text = "When executing the exercise extract all extra words"
    val words = text.split("\\s+")
    val extWords = words.filter(_.startsWith("ext"))
    println(extWords.mkString(" "))
  }
}