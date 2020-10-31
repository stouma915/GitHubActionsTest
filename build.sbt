name := "GitHubActionsTest"

version := "0.1"

scalaVersion := "2.13.3"

lazy val root = (project in file("."))
  .settings(
    assemblyOutputPath in assembly := baseDirectory.value / "target" / "build" / s"GitHubActionsTest.jar"
  )