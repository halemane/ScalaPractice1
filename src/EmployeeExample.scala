class Employee(val name:String, val eid:Int, val dept:Int, val sal:Double)
{
  def print={
    println(s"name of the employee is $name and who's salary is $sal")
  }
}

object EmployeeExample {
  def main(args: Array[String]): Unit = {
    val e = new Employee("pavan",1,10, 22000.9)
    e.print
  }

}
