package com.toyrobot

import com.toyrobot.command.{LeftCommand, MoveCommand, PlaceCommand, RightCommand}
import com.toyrobot.model.Table

object ToyRobot {
  def executeCommand(command: String, table: Table): Table = {
      command match {
        case placeRegEx => PlaceCommand.execute(table, command)
        case "MOVE" => MoveCommand.execute(table)
        case "LEFT" => LeftCommand.execute(table)
        case "RIGHT" => RightCommand.execute(table)
      }
  }

 val placeRegEx =
    "^\\d,\\d," +
      "(" +
        "\\bNORTH\\b" +
        "|\\bSOUTH\\b" +
        "|\\bEAST\\b" +
        "|\\bWEST\\b" +
      ")"

}
