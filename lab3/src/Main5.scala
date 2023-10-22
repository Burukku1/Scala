object Main5 {
  def main(args: Array[String]): Unit = {
    val text = "Hello to everybody"
    val withoutVowels = text.replaceAll("[AEIOUaeiou]", "")
    println(withoutVowels)
  }
}
