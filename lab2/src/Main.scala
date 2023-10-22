import scala.::
import scala.collection.mutable.ListBuffer
import scala.io.StdIn



//1.Написать функцию для подсчета суммы элементов списка, значение которых лежит в диапазоне [0,5]. Список задать самостоятельно.
//2.Написать функцию для подсчета суммы элементов списка с номерами, содержащимися в другом списке. Список задать самостоятельно.
//3.Написать функцию для отыскания индекса минимального элемента списка. Список задать самостоятельно.
//4.Написать функцию для проверки того, что элементы списка не превосходят заданной величины. Список задать самостоятельно.
//5.Написать функцию для подсчета числа  элементов списка, которые не превосходят заданной величины. Список задать самостоятельно.

object Main45 {


  def fun0(list1: List[Int], list2: List[Int], list3: ListBuffer[Int]): ListBuffer[Int] = {
    val newList = new ListBuffer[Int]()
    if (list1.isEmpty && list2.isEmpty) {
      list3.reverse
    } else if (list1.isEmpty) {
      fun0(list1, list2.tail, newList.addOne(list2.head))
    } else {
      fun0(list1.tail, list2, newList.addOne(list1.head))
    }
  }


  def funSum(lst: ListBuffer[Int], index: Int = 0, sum: Int = 0): Int = {
    if (index >= lst.length) {
      sum
    } else {
      if (index % 2 != 0) {
        val currentElement = lst(index)
        funSum(lst, index + 1, sum + currentElement)
      } else {
        funSum(lst, index + 1, sum)
      }
    }
  }

  def fun1(myList: List[Int]): Int = {
    if (myList.isEmpty) 0
    else {
      val head = myList.head
      val tailSum = fun1(myList.tail)
      if (head >= 0 && head <= 5) head + tailSum
      else tailSum
    }
  }

  def fun2(myList: List[Int], indexes: List[Int], sum: Int = 0): Int = {
    if (indexes.isEmpty) sum
    else {
      val index = indexes.head
      if (index < myList.length) {
        val element = myList(index)
        fun2(myList, indexes.tail, sum + element)
      } else {
        fun2(myList, indexes.tail, sum)
      }
    }
  }

  def fun3(myList: List[Int], minval: Int): Int = {
    if (myList.isEmpty) minval
    else {
      val head = myList.head
      val newMinval = if (head < minval) head else minval
      fun3(myList.tail, newMinval)
    }
  }


  def fun4(myList: List[Int], num: Int, newList: List[Int] = Nil, count: Int = 0): (Int, List[Int]) = {
    if (myList.isEmpty) (count, newList.reverse)
    else {
      val head = myList.head
      if (head > num) fun4(myList.tail, num, head :: newList, count + 1)
      else fun4(myList.tail, num, newList, count)
    }
  }

  def fun5(myList: List[Int], num: Int): Int = {
    if (myList.isEmpty) 0
    else {
      val head = myList.head
      if (head <= num) 1 + fun5(myList.tail, num)
      else fun5(myList.tail, num)
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter elements of the list (integers), separated by spaces:")
    val numbers = StdIn.readLine().split(" ").map(_.toInt).toList
    println("\nEntered list: " + numbers.mkString(", "))

    if (numbers.isEmpty) {
      println("The list is empty")
    } else {

      //task 1
      println("\nSum of elements eq [0,5]: " + fun1(numbers))

      //task2
      print("\nEnter indexes (0,1,2...) of elements to sum, separated by spaces: ")
      val indexes = StdIn.readLine().split(" ").map(_.toInt).toList
      println("Result: " + fun2(numbers,indexes,0))

      //task 3
      println("\nMin element: " + fun3(numbers, numbers.head))

      //task 4
      print("\nElements greater than A=")
      val numA = StdIn.readInt()
      val (counter, newList) = fun4(numbers, numA, List.empty,0)
      if (counter == 0) {
        println("There's no such elements")
      } else {
        println(s"These $counter elements are greater than $numA: " + newList.mkString(" "))
      }


      //task 5
      print("\nNumber of elements less than or eq B=")
      val numB = StdIn.readInt()
      println("=> " + fun5(numbers,numB))


//      val list1 = List(1, 2, 3)
//      val list2 = List(4, 5, 6)
//      val listBuf = ListBuffer[Int]()
//      val result = fun0(list1, list2,listBuf)
//      println(result)
//      val sum = funSum(result);
//      println(sum)
    }

  }
}
