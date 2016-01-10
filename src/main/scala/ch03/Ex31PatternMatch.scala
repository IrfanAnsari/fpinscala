package ch03

object Ex31PatternMatch {

  def evaluateOutPut(ls :  List[Int]) = {
    val x = ls match {
      case Cons(x, Cons(2, Cons(4, _))) => x
      case Nil => 42
      case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
      case Cons(h, t) => h + List.sum(t)
      case _ => 101
    }
    x
  }

}

