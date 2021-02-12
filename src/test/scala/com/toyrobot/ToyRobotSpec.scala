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
    "Execute Invalid Command" >> {
      ToyRobot.executeCommand(Table(-1, -1, null), "JUMP") ==== Table(-1, -1, null)
    }
    "Execute Invalid Move command" >> {
      ToyRobot.executeCommand(Table(0, 0, "SOUTH"),"MOVE") ==== Table(0, 0, "SOUTH")
    }
    "Execute Invalid Place command" >> {
      ToyRobot.executeCommand(Table(-1, -1, null),"PLACE 4 4") ==== Table(-1, -1, null)
    }
    "Execute Invalid Place out of table command" >> {
      ToyRobot.executeCommand(Table(0, 0, "EAST"),"PLACE 5,4,EAST") ==== Table(0, 0, "EAST")
    }
  }

}
