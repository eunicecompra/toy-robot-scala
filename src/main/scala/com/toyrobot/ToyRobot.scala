package com.toyrobot

import com.toyrobot.command.{LeftCommand, MoveCommand, PlaceCommand, ReportCommand, RightCommand}
import com.toyrobot.model.Table

object ToyRobot {
  val placeRegEx =
    "PLACE \\d,\\d,(\\bNORTH\\b|\\bSOUTH\\b|\\bEAST\\b|\\bWEST\\b)".r
  val table_x = 5
  val table_y = 5

  def executeCommand(table: Table, command: String): Table = {
      if (placeRegEx.matches(command)) {
        checkTable(table,PlaceCommand.execute(table, command))
      } else {
        command match {
          case "MOVE" => checkTable(table,MoveCommand.execute(table))
          case "LEFT" => LeftCommand.execute(table)
          case "RIGHT" => RightCommand.execute(table)
          case "REPORT" => ReportCommand.execute(table)
          case _ => table
        }
      }
  }

  def checkTable(originalTable: Table, table: Table): Table = {
    if ( table.x >= table_x || table.x < 0 || table.y >= table_y  || table.y < 0 ) originalTable else table
  }
}
