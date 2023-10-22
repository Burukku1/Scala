object Main8 {
  def main(args : Array[String]) : Unit = {
    val text = "Hello to everybody"
    val pattern = """\s""".r
    val modifiedText = pattern.replaceFirstIn(text, " with heartness ")
    println(modifiedText)
  }
}
