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
  }

}
