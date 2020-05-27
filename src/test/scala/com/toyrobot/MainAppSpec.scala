package com.toyrobot

import org.specs2.mutable.Specification

class MainAppSpec extends Specification {
  "MainApp" >> {
    "Toy robot commands test" >> {
      MainApp.main(Array("src/test/resources/commands.txt"))
      true
    }
  }

}
