package m1

import m1.pageobjects._

import common._

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class SimulationM1 extends Simulation {
  val httpProtocol = http
    .baseUrl("http://demostore.gatling.io")

  val userCount: Int = Helper.getProperty("USER_COUNT", "10").toInt
  val totalDuration: Int = Helper.getProperty("TOTAL_DURATION", "60").toInt

  val computerFeeder = csv("data/computer-data.csv").circular

  object UserJourneys {
    def pauseDuration = 2.seconds
    def basic = {
      exec(SiteCrud.viewProduct(computerFeeder))
        .pause(pauseDuration)
        .exec(SiteCrud.viewHomepage)
    }
  }

  object Scenarios {
    def default = scenario("Default Scenario")
      .during(totalDuration.seconds) {
        randomSwitch(
          100d -> exec(UserJourneys.basic)
        )
      }
  }

  setUp(
    Scenarios.default
      .inject(rampUsers(userCount) during (totalDuration / 2).ceil.seconds).protocols(httpProtocol)
  )
}
