package com.keithalcock.debug

import scala.quoted.Expr
import scala.quoted.Quotes

object Debug:

  inline def info(anys: Any*): Unit = println("info")

  // trace gives line and file
  inline def trace(anys: Any*): Unit =
    println("Debugging...")
    anys.foreach { any =>
      println(any.toString)
    }

  inline def traceOne(inline any: Any): Unit = ${traceOneImpl('any)}

  def traceOneImpl(expr: Expr[Any])(using Quotes): Expr[Any] =
    println(expr.show)
    expr

//    '{ println("Simon says, the value of " + ${Expr(expr.show)} + " is " + $expr) }
