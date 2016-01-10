package ch02

import scala.annotation.tailrec

object Ex22Sorter {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {

    @tailrec
    def doIt(n: Int): Boolean = {
      if (n >= as.length - 1) true
      else if (ordered(as(n), as(n + 1))) false
      else doIt(n + 1)
    }

    doIt(0)
  }
}
