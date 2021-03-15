= Learning Gatling with Frontline

## Overview
This repo has been taken from https://github.com/gatling/gatling-gradle-plugin-demo


## M1 - An intro to scala and gatling
### Resources
- [Scala Crash Course](https://lintool.github.io/SparkTutorial/slides/day1_Scala_crash_course.pdf)
- [Gatling Tutorial](https://academy.gatling.io/collections)
- [Gatling Cheatsheet](https://gatling.io/docs/current/cheat-sheet/)

### Items
- [Creating User journeys](https://github.com/ahmed-anas/learning-plan-gatling/blob/221f5bbf4485c0c07302c7bcc841015e81eb2707/src/gatling/scala/m1/SimulationM1.scala#L20-L27) from a set of [page actions](https://github.com/ahmed-anas/learning-plan-gatling/blob/master/src/gatling/scala/m1/pageobjects/SiteCrud.scala)
- Using a data feeder to load data from a CSV file ([ref1](https://github.com/ahmed-anas/learning-plan-gatling/blob/221f5bbf4485c0c07302c7bcc841015e81eb2707/src/gatling/scala/m1/pageobjects/SiteCrud.scala#L9), [ref2](https://github.com/ahmed-anas/learning-plan-gatling/blob/221f5bbf4485c0c07302c7bcc841015e81eb2707/src/gatling/scala/m1/SimulationM1.scala#L18))
- [Helper method](https://github.com/ahmed-anas/learning-plan-gatling/blob/221f5bbf4485c0c07302c7bcc841015e81eb2707/src/gatling/scala/common/Helper.scala#L4) to allow [configurable parameters](https://github.com/ahmed-anas/learning-plan-gatling/blob/221f5bbf4485c0c07302c7bcc841015e81eb2707/src/gatling/scala/m1/SimulationM1.scala#L15-L16)
- [Test setup](https://github.com/ahmed-anas/learning-plan-gatling/blob/master/src/gatling/scala/m1/SimulationM1.scala#L40) with ramp up followed by consistent users

