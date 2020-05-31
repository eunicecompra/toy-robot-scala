package com.toyrobot

import com.toyrobot.model.Table
import org.specs2.mutable.Specification

class ToyRobotSpec extends Specification {
  "Toy Robot" >> {
    "Execute Place command" >> {
      ToyRobot.executeCommand(Table(-1, -1, null), "PLACE 0,0,NORTH") ==== Table(0, 0, "NORTH")
    }
    "Execute Move command" >> {
      ToyRobot.executeCommand(Table(0, 0, "NORTH"),"MOVE") ==== Table(0, 1, "NORTH")
    }
    "Execute Left command" >> {
      ToyRobot.executeCommand(Table(0, 1, "NORTH"),"LEFT") ==== Table(0, 1, "WEST")
    }
    "Execute Right command" >> {
      ToyRobot.executeCommand(Table(0, 1, "WEST"),"RIGHT") ==== Table(0, 1, "NORTH")
    }
    "Execute Report command" >> {
      ToyRobot.executeCommand(Table(0, 1, "WEST"), "REPORT") ==== Table(0, 1, "WEST")
    }
  }

}
