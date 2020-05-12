package com.toyrobot

import com.toyrobot.model.Table

case class Place()

object Place {
  def execute(table: Table, command: String): Table = {
    val location: Array[String] = command.replaceFirst("PLACE ", "").split(',')
    table.copy(location(0).toInt, location(1).toInt, location(2))
  }

}
