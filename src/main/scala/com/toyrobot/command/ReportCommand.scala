package com.toyrobot.command

import com.toyrobot.model.Table

case class ReportCommand() extends Command

object ReportCommand {
  def execute(table: Table) = table
}
