name := "basic-project"

organization := "example"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.7"

val specs2Version = "3.6.4"

crossScalaVersions := Seq("2.10.4", "2.11.2")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.5" % "test",
  "org.mockito" % "mockito-all" % "1.10.19" withSources(),
  "org.specs2" %% "specs2-core" % specs2Version withSources(),
  "org.specs2" %% "specs2-mock" % specs2Version withSources() excludeAll ExclusionRule(organization = "org.mockito"),
  "org.specs2" %% "specs2-matcher-extra" % specs2Version withSources(),
  "org.specs2" %% "specs2-junit" % specs2Version withSources()
)

initialCommands := "import example._"
