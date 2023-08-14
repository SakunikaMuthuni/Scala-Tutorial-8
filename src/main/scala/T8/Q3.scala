package T8

object Q3 {
  def toUpper(name:String): String = {
    name.toUpperCase();
  }

  def toLower(name:String): String = {
    name.toLowerCase();
  }

  def formatNames(name : String, format : String => String): String = {
    format(name);
  }

  def main(args:Array[String]): Unit = {
    val names=List("Benny", "Niroshan", "Saman","Kumara");

    val name1=formatNames(names(0),name=>toUpper(name));

    var name2sub1=names(1).substring(0,2);
    var name2sub2=names(1).substring(2);
    name2sub1=formatNames(name2sub1,name=>toUpper(name));
    name2sub2=formatNames(name2sub2,name=>toLower(name));
    val name2=name2sub1.concat(name2sub2);

    val name3=formatNames(names(2),name=>toLower(name));

    var name4sub1=names(3).substring(0,1);
    var name4sub2=names(3).substring(1,5);
    var name4sub3=names(3).substring(5);
    name4sub1=formatNames(name4sub1,name=>toUpper(name));
    name4sub2=formatNames(name4sub2,name=>toLower(name));
    name4sub3=formatNames(name4sub3,name=>toUpper(name));
    val name4=name4sub1.concat(name4sub2).concat(name4sub3);

    println(name1);
    println(name2);
    println(name3);
    println(name4);
  }
}
