package com.toyrobot

import org.specs2.mutable.Specification

class PlaceSpec extends Specification {
  "Place command" >> {
    "where toy robot's location is 0,0,NORTH" >> {
      val currentLocation = Place.execute("PLACE 0,0,NORTH")
      currentLocation === "0,0,NORTH"
    }
  }

}
