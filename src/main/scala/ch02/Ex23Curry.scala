package ch02

class Ex23Curry {

  def curry[A, B, C](f: (A, B) => C): A => B => C = (a: A) => (b: B) => f(a, b)

}

class CurryExample {
  def modNCurried(n: Int)(x: Int) = x % n == 0
}
