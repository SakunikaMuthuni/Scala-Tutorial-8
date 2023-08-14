package T8

object Q1 {
  def findInterest: (Double,Double) => Double = (deposit,rate) => deposit*rate

  def flatForDeposit: Double => Double= deposit =>
    if(deposit>=0){
      if(deposit<=20000){
        0.02;
      }else if(deposit<=200000){
        0.04
      }else if(deposit<=2000000){
        0.035;
      }else{
        0.065;
      }
    }else{
      0.0;
    }

  def main(args:Array[String]): Unit = {
    print("Enter the Deposit amount :");
    val deposit=scala.io.StdIn.readDouble();
    val rate=flatForDeposit(deposit);
    print("The interest for deposit under $rate :"+"%.2f".format(findInterest(deposit,rate)));
  }
}
