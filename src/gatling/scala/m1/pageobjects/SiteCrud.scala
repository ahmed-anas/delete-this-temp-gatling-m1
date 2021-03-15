package m1.pageobjects

import io.gatling.core.Predef._
import io.gatling.core.feeder.BatchableFeederBuilder
import io.gatling.http.Predef._

object SiteCrud {
  def viewProduct(computerFeeder: BatchableFeederBuilder[String]#F) = {
    feed(computerFeeder)
      .exec(http("Create Computer")
        .get("/product/${productPartialUrl}")
        .check(status.is(200))
      )
  }

  def viewHomepage = {
    exec(http("View Homepage")
      .get("/")
      .check(status.is(200))
    )
  }
}
