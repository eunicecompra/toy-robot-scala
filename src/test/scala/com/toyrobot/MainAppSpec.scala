package com.toyrobot

import com.toyrobot.model.Table
import org.specs2.mutable.Specification

class MainAppSpec extends Specification {
  "MainApp" >> {
    "Toy robot commands test" >> {
      val table = MainApp.play("src/test/resources/commands.txt")
      table ==== Table(3, 3, "NORTH")
    }
  }

}
