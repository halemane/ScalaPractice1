case class Student1(name:String, sid:Int, dept:Int, place:String)
{
  def print=println(s"name of the student is $name and who's deptno is $dept from $place")
}

object CaseClassExample {
  def main(args: Array[String]): Unit = {
    val s=Student1("pavan",20,10,"bangalore")
    println(s)
    val s1=Student1("pavan",20,10,"bangalore")
    println(s==s1)
    val t=s match {
      case s:Student1 => (s.name,s.dept,s.place,s.sid)
    }
    println(t)

  }
}
