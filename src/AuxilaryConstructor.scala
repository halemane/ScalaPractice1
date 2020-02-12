class Student(val name:String, val sid:Int, val place:String)
{
  def print= println(s"name of the student is $name and student id is $sid and place is $place")
  def this(name:String, sid:Int)= this(name,sid,"")
  def this(name:String)=this(name,0)
}

object AuxilaryConstructor {
  def main(args: Array[String]): Unit = {
    val s =new Student("pavan",21,"chitradurga")
    s.print
    val s1= new Student("ravi",22)
    s1.print
    val s3= new Student("Kiran")
    s3.print
    println(s3)
  }
}


