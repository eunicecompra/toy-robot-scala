package com.toyrobot

import scala.io.Source

object MainApp extends App {
  println("Playing with the Toy Robot")
  val file = args(0)
  println(s"Reading commands from $file")

  val bufferedSource = Source.fromFile(file)
  for (command <- bufferedSource.getLines) {
    println(command)
  }

  bufferedSource.close()
}
