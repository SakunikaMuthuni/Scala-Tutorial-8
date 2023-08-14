package T8

object Q2 {
  def resultMessage: Int => Unit = (input) => {
    input match {
      case n if n < 0 => println("Negative input");
      case n if n == 0 => println("Zero input");
      case n if n % 2 == 0 => println("Even number is given");
      case _ => println("Odd number is given");
    }
  }
  def main(args:Array[String]): Unit = {
    print("Enter the integer input :");
    val input=scala.io.StdIn.readInt();
    resultMessage(input);
  }
}
