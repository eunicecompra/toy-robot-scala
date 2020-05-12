package com.toyrobot

import com.toyrobot.model.Table
import org.specs2.mutable.Specification

class PlaceSpec extends Specification {
  "Place command" >> {
    "where toy robot's location is 0,0,NORTH" >> {
      Place.execute(Table(-1, -1, null), "PLACE 0,0,NORTH") ==== Table(0, 0, "NORTH")
    }
  }
}
