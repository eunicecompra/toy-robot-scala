package com.toyrobot

object Place {
  def execute(command: String): String = {
    command.replaceFirst("PLACE ", "")
  }

}
