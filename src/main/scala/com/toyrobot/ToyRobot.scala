package com.toyrobot

import com.toyrobot.command.{LeftCommand, MoveCommand, PlaceCommand, RightCommand}
import com.toyrobot.model.Table

object ToyRobot {
  def processCommands(commands: List[String], t: Table): Table = {
    def execute(table:Table, command: String): Table = {
      command.split(" ")(0) match {
        case "PLACE" => PlaceCommand.execute(table, command)
        case "MOVE" => MoveCommand.execute(table)
        case "LEFT" => LeftCommand.execute(table)
        case "RIGHT" => RightCommand.execute(table)
        case _ => null
      }
    }
    (for {
      c <- commands
      table: Table = execute(t, c)
    } yield table).last
  }

}
