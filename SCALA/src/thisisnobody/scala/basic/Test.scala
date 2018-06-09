package thisisnobody.scala.basic

object Test {
  def main(args: Array[String]) {
    print("hello\tworld\n\n");

    val v1: Integer = 1;
    val v2: String = "hello";
    var v3: String = "hello";
    var v4, v5: String = "Hello World";
    println(v1 + "," + v2 + "," + v3 + "," + v4 + "," + v5);

    if (v1 == 1) {
      println(v1);
    } else if (v2.equals("hello")) {
      println(v2);
    }

    var a = 0;

    for (a <- 1 to 10) {
      println(a);
    }

    for (a <- 1 until 10) {
      println(a);
    }

    for (a <- 1 to 2; b <- 2 to 3) {
      println("a: " + a);
      println("b: " + b);
    }
    
    var arr = List(1,2,3,4,5,6,6,7,8,9,10);
    var b = 0;
    var v6 = for(b <- arr; if b != 3; if b < 8) yield b;
    for(a <- v6){
      println(a);
    }
    
    while(a < 20){
      println(a);
      a = a + 1;
    }
    
  }
}