package com.toyrobot

import com.toyrobot.command.{LeftCommand, MoveCommand, PlaceCommand, RightCommand}
import com.toyrobot.model.Table

object ToyRobot {
  val placeRegEx =
    "PLACE \\d,\\d,(\\bNORTH\\b|\\bSOUTH\\b|\\bEAST\\b|\\bWEST\\b)".r

  def executeCommand(command: String, table: Table): Table = {
      if (placeRegEx.matches(command)) {
        PlaceCommand.execute(table, command)
      } else {
        command match {
          case "MOVE" => MoveCommand.execute(table)
          case "LEFT" => LeftCommand.execute(table)
          case "RIGHT" => RightCommand.execute(table)
        }
      }
  }
}
