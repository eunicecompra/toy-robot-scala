package com.toyrobot

import com.toyrobot.model.Table
import org.specs2.mutable.Specification

class ToyRobotSpec extends Specification {
  "Toy Robot" >> {
    "Process commands" >> {
      val table = ToyRobot.processCommands(
                    List("PLACE 0,0,NORTH", "MOVE", "LEFT", "RIGHT"),
                    Table(-1, -1, null))
      table ==== Table(0, 1, "NORTH")
    }
  }

}
