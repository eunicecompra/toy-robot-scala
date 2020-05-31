package com.toyrobot

import com.toyrobot.model.Table

import scala.io.Source

object MainApp {

  def main(args: Array[String]): Unit = {
    println("> Playing with the Toy Robot")
    val file = args(0)
    println(s"> Reading commands from $file")
    val table = play(file)
    println(s"${table.x},${table.y},${table.direction}")
  }

  def play(file: String): Table = {
    val bufferedSource = Source.fromFile(file)

    try {
      bufferedSource.getLines().foldLeft(Table(-1, -1, null))((table, command) => ToyRobot.executeCommand(table, command))
    } finally {
      bufferedSource.close()
    }
  }
}
