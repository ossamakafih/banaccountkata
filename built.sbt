import sbt.Keys.libraryDependencies

lazy val root = (project in file("."))
  .settings(
    name         := "Bank Account",
    organization := "soat",
    scalaVersion := "2.11.8",
    version      := "0.1.0-SNAPSHOT",
      libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test",
    libraryDependencies += "org.scalamock" %% "scalamock" % "4.1.0" % "test",
    libraryDependencies += "com.google.guava" % "guava" % "12.0"
  )
