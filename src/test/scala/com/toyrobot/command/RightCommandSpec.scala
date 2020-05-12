package com.toyrobot.command

import com.toyrobot.model.Table
import org.specs2.mutable.Specification

class RightCommandSpec extends Specification {
  "Right command" >> {
    "where toy robot's current location is at 3,3,NORTH" >> {
      RightCommand.execute(Table(3, 3, "NORTH")) ==== Table(3, 3, "EAST")
    }
    "where toy robot's current location is at 3,3,EAST" >> {
      RightCommand.execute(Table(3, 3, "EAST")) ==== Table(3, 3, "SOUTH")
    }
    "where toy robot's current location is at 3,3,SOUTH" >> {
      RightCommand.execute(Table(3, 3, "SOUTH")) ==== Table(3, 3, "WEST")
    }
    "where toy robot's current location is at 3,3,WEST" >> {
      RightCommand.execute(Table(3, 3, "WEST")) ==== Table(3, 3, "NORTH")
    }
  }

}
