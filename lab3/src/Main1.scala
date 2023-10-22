

//заменить латинские буквы на русские или цифры???? как именно??
object Main1 {
  def main(args: Array[String]): Unit = {
    val text = "Hello to everybody"
    val cyrillicText = text
      .replaceAll("H", "х")
      .replaceAll("e", "э")
      .replaceAll("l", "л")
      .replaceAll("o", "о")
      .replaceAll("t", "т")
      .replaceAll("u", "у")
      .replaceAll("r", "р")
      .replaceAll("v", "в")
      .replaceAll("b", "б")
      .replaceAll("y", "и")
      .replaceAll("d", "д")


    println(cyrillicText)

    val newText = text.replaceAll("[A-Za-z]", "0")
    println(newText)
  }
}
