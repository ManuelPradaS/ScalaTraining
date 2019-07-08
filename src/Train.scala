
object Train {


  def maybeItWillReturnSomething(flag: Boolean): Option[String] = {
    if (flag) Some("Found value") else None
  }

  val value1 = maybeItWillReturnSomething(true)
  val value2 = maybeItWillReturnSomething(false)

  def main(args: Array[String]): Unit = {
    print(value1.getOrElse("HEY"))
  }


}
