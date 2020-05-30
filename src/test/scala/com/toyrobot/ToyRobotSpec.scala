package com.toyrobot

import com.toyrobot.model.Table
import org.specs2.mutable.Specification

class ToyRobotSpec extends Specification {
  "Toy Robot" >> {
    "Execute Place command" >> {
      val table = ToyRobot.executeCommand("PLACE 0,0,NORTH",
                    Table(-1, -1, null))
      table ==== Table(0, 0, "NORTH")
    }
    "Execute Move command" >> {
      val table = ToyRobot.executeCommand("MOVE",
        Table(0, 0, "NORTH"))
      table ==== Table(0, 1, "NORTH")
    }
    "Execute Left command" >> {
      val table = ToyRobot.executeCommand("LEFT",
        Table(0, 1, "NORTH"))
      table ==== Table(0, 1, "WEST")
    }
    "Execute Right command" >> {
      val table = ToyRobot.executeCommand("RIGHT",
        Table(0, 1, "WEST"))
      table ==== Table(0, 1, "NORTH")
    }
    "Execute Report command" >> {
      val table = ToyRobot.executeCommand("REPORT",
        Table(0, 1, "WEST"))
      table ==== Table(0, 1, "WEST")
    }
  }

}
