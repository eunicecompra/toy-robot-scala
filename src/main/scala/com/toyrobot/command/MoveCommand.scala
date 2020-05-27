package com.toyrobot.command

import com.toyrobot.model.Table

case class MoveCommand() extends Command

object MoveCommand {
  def execute(table: Table): Table = {
    table.direction match {
      case "NORTH" => table.copy(y = table.y + 1)
      case "SOUTH" => table.copy(y = table.y - 1)
      case "EAST" => table.copy(x = table.x + 1)
      case "WEST" => table.copy(x = table.x - 1)
    }
  }

}
