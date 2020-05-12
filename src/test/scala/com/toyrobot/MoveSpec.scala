package com.toyrobot

import com.toyrobot.model.Table
import org.specs2.mutable.Specification

class MoveSpec extends Specification {
  "Move command" >> {
    "where toy robot's current location is at 0,0,NORTH" >> {
      val table = Move.execute(Table(0, 0, "NORTH"))
      table ==== Table(0, 1, "NORTH")
    }
    "where toy robot's current location is at 3,3,SOUTH" >> {
      val table = Move.execute(Table(3, 3, "SOUTH"))
      table ==== Table(3, 2, "SOUTH")
    }
    "where toy robot's current location is at 3,3,EAST" >> {
      val table = Move.execute(Table(3, 3, "EAST"))
      table ==== Table(4, 3, "EAST")
    }
    "where toy robot's current location is at 3,3,WEST" >> {
      val table = Move.execute(Table(3, 3, "WEST"))
      table ==== Table(2, 3, "WEST")
    }
  }

}
