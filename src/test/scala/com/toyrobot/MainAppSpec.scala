package com.toyrobot

import com.toyrobot.model.Table
import org.specs2.mutable.Specification

class MainAppSpec extends Specification {
  "MainApp" >> {
    "Main app test" >> {
      MainApp.main(Array("src/test/resources/commands.txt"))
      true
    }
    "Toy robot commands from file test" >> {
      MainApp.play("src/test/resources/commands.txt") ==== Table(3, 3, "NORTH")
    }
  }

}
