package com.toyrobot

import com.toyrobot.model.Table
import org.specs2.mutable.Specification

class LeftCommandSpec extends Specification {
  "Left command" >> {
    "where toy robot's current location is at 3,3,NORTH" >> {
      LeftCommand.execute(Table(3, 3, "NORTH")) ==== Table(3, 3, "WEST")
      LeftCommand.execute(Table(3, 3, "WEST")) ==== Table(3, 3, "SOUTH")
      LeftCommand.execute(Table(3, 3, "SOUTH")) ==== Table(3, 3, "EAST")
      LeftCommand.execute(Table(3, 3, "EAST")) ==== Table(3, 3, "NORTH")
    }
  }
}
