package com.keithalcock.debug.apps

import com.keithalcock.debug.Debug

object DebugApp extends App:
  println("Hello, world!")
  Debug.trace(5, "nothing", true)
  Debug.traceOne(5)
