import sbt._
import sbt.Keys._

object Dependencies {

  private val kafkaVersion = "2.3.1"

  val kakfaDeps = List(
    "org.apache.kafka" %% "kafka"         % kafkaVersion,
    "org.apache.kafka" %% "kafka-streams" % kafkaVersion,
    "org.apache.kafka" %% "kafka-clients" % kafkaVersion)

  val myDependencies =
    Seq("org.typelevel" %% "cats-effect" % "2.0.0") ++
    kakfaDeps

}

