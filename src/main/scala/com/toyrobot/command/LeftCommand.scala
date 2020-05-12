package com.toyrobot.command

import com.toyrobot.model.Table

case class LeftCommand()

object LeftCommand {
  def execute(table: Table): Table = {
    table.direction match {
      case "NORTH" => table.copy(direction = "WEST")
      case "WEST" => table.copy(direction = "SOUTH")
      case "SOUTH" => table.copy(direction = "EAST")
      case "EAST" => table.copy(direction = "NORTH")
    }
  }
}
