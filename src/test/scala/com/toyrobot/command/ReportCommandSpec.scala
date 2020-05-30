package com.toyrobot.command

import com.toyrobot.model.Table
import org.specs2.mutable.Specification

class ReportCommandSpec extends Specification {
  "Report command test" >> {
    "Report table" >> {
      ReportCommand.execute(Table(4,4,"SOUTH")) ==== Table(4,4,"SOUTH")
    }
  }

}
