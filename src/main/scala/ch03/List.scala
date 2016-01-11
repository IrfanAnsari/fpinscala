package ch03

import scala.annotation.tailrec

sealed trait List[+A]

case object Nil extends List[Nothing]

case class Cons[+A](x: A, tail: List[A]) extends List[A]

object List {
  def filter[A](as: List[A])(f: A => Boolean): List[A] = as match {
    case Nil => Nil
    case Cons(h, t) if f(h) => filter(t)(f)
    case Cons(h, t) if !f(h) => Cons(h, filter(t)(f))

  }


  def doubleToString(doubles: List[Double]): List[String] = doubles match {
    case Nil => Nil
    case Cons(h, t) => Cons(h.toString, doubleToString(t))

  }


  def concatenate[A](lists: List[List[A]]): List[A] = lists match {
    case Nil => Nil
    case Cons(h, t) => appendWithFoldRight(h, concatenate(t))
  }


  def init[A](l: List[A]): List[A] = l match {
    case Nil => sys.error("can't do it")
    case Cons(h, Nil) => Nil
    case Cons(h, t) => Cons(h, init(t))
  }

  @tailrec
  def drop[A](ls: List[A], n: Int): List[A] =
    if (n <= 0) ls
    else
      ls match {
        case Nil => sys.error("Can't drop")
        case Cons(h, t) => drop(t, n - 1)
      }


  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = {
    l match {
      case Nil => Nil
      case Cons(h, t) => if (f(h)) dropWhile(t, f) else Cons(h, dropWhile(t, f))
    }
  }


  def tail[A](ls: List[A]) = ls match {
    case Nil => Nil
    case Cons(h, Nil) => Nil
    case Cons(h, t) => t
  }

  def setHead[A](ls: List[A], h: A): List[A] = ls match {
    case Nil => Nil
    case Cons(x, t) => Cons(h, t)
  }

  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)

  }

  def product(ints: List[Int]): Int = ints match {
    case Nil => 1
    case Cons(h, t) => h * product(t)
  }

  def apply[A](a: A*): List[A] = {
    if (a.isEmpty) Nil
    else
      Cons(a.head, apply(a.tail: _*))
  }

  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B = {
    as match {
      case Nil => z
      case Cons(h, t) => f(h, foldRight(t, z)(f))
    }
  }

  @tailrec
  def foldLeft[A, B](ls: List[A], z: B)(f: (B, A) => B): B = {
    ls match {
      case Nil => z
      case Cons(h, t) => foldLeft(t, f(z, h))(f)
    }
  }

  def transform(ints: List[Int]): List[Int] = ints match {
    case Nil => Nil
    case Cons(h, t) => Cons(h + 1, transform(t))
  }

  def map[A, B](ls: List[A])(f: A => B): List[B] = ls match {
    case Nil => Nil
    case Cons(h, t) => Cons(f(h), map(t)(f))
  }

  def reverse(ls: List[Int]): List[Int] = foldLeft(ls, Nil: List[Int])((x, y) => Cons(y, x))

  def appendWithFoldRight[A](l: List[A], r: List[A]): List[A] = foldRight(l, r)(Cons(_, _))

  //TODO
  def folRightWithFoldLeft[A, B](ls: List[A], z: B)(f: (A, B) => B): B = ???


  def sumWithFoldLeft(ints: List[Int]): Int = foldLeft(ints, 0)((x, y) => x + y)

  def productWithFoldLeft(ints: List[Int]): Int = foldLeft(ints, 1)((x, y) => x * y)


  def length[A](ls: List[A]): Int = foldRight(ls, 0)((x, y) => y + 1)

  def sumWithFoldRight(ls: List[Int]): Int = foldRight(ls, 0)((x, y) => x + y)

  def productWithFoldRight(ls: List[Int]): Int = foldRight(ls, 1)(_ * _)

}