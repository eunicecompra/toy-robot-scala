package com.toyrobot.command

import com.toyrobot.model.Table
import org.specs2.mutable.Specification

class MoveCommandSpec extends Specification {
  "Move command" >> {
    "where toy robot's current location is at 0,0,NORTH" >> {
      MoveCommand.execute(Table(0, 0, "NORTH")) ==== Table(0, 1, "NORTH")
    }
    "where toy robot's current location is at 3,3,SOUTH" >> {
      MoveCommand.execute(Table(3, 3, "SOUTH")) ==== Table(3, 2, "SOUTH")
    }
    "where toy robot's current location is at 3,3,EAST" >> {
      MoveCommand.execute(Table(3, 3, "EAST")) ==== Table(4, 3, "EAST")
    }
    "where toy robot's current location is at 3,3,WEST" >> {
      MoveCommand.execute(Table(3, 3, "WEST")) ==== Table(2, 3, "WEST")
    }
  }

}
