package com.toyrobot

import com.toyrobot.model.Table

import scala.io.Source

object MainApp {

  def main(args: Array[String]): Unit = {
    println("Playing with the Toy Robot")
    val file = args(0)
    println(s"Reading commands from $file")
    play(file)
  }

  def play(file: String): Table = {
    val bufferedSource = Source.fromFile(file)

    var table = Table(-1, -1, null)
    for (command <- bufferedSource.getLines()) {
      table = ToyRobot.executeCommand(command, table)
    }
    bufferedSource.close()

    table
  }
}
