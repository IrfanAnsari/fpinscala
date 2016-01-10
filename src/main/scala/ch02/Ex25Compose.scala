package ch02

class Ex25Compose {
  def compose[A,B,C](f: B => C, g: A => B): A => C = (a: A) => f(g(a))
}
