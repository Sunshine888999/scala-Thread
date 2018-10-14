object ThreadTest {
  def main(args: Array[String]): Unit = {
    var t1 = new ThreadExample()
    var t2 = new ThreadExample()
    t1.start()
    t2.start()
  }
}


class ThreadExample extends Thread{
  override def run(): Unit = {
    for (i <- 0 to 5){
      println(this.getName + i)
      Thread.sleep(500)
    }
  }
}