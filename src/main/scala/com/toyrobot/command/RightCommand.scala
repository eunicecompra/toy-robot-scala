package com.toyrobot.command

import com.toyrobot.model.Table

case class RightCommand() extends Command

object RightCommand {
  def execute(table: Table): Table = {
    table.direction match {
      case "NORTH" => table.copy(direction = "EAST")
      case "EAST" => table.copy(direction = "SOUTH")
      case "SOUTH" => table.copy(direction = "WEST")
      case "WEST" => table.copy(direction = "NORTH")
    }
  }
}
