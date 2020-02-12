import java.io.FileNotFoundException
import scala.io.Source

object EitherLeftRightExample {
  def main(args: Array[String]): Unit = {
    def readFile(path:String):Either[Exception,List[String]]={
      try{
        Right(Source.fromFile(path).getLines().toList)
      }
      catch {
        case e:FileNotFoundException => Left(e)
      }
    }
    val list=readFile("C:/Users/p.hanumantharayapp/Desktop/BigData/sample.txt")
    val value= if(list.isRight) list.right.get else list.left.get
    println(value)
  }
}
