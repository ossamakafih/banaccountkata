import sbt.Keys.libraryDependencies

lazy val root = (project in file("."))
  .settings(
    name         := "Bank Account",
    organization := "soat",
    scalaVersion := "2.11.8",
    version      := "0.1.0-SNAPSHOT",
	libraryDependencies += "org.scalafx" % "scalafx_2.11" % "8.0.102-R11",
	libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.2.0",
	libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.2.0",
	libraryDependencies += "org.apache.spark" % "spark-mllib_2.11" % "2.2.0",
	libraryDependencies += "org.apache.spark" % "spark-graphx_2.11" % "2.2.0",
		libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.6",
		libraryDependencies += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.8.8",
		libraryDependencies += "org.elasticsearch" %% "elasticsearch-spark-20" % "6.4.0",
		libraryDependencies += "org.apache.kafka" % "kafka-clients" % "1.0.0" exclude("org.lz4", "lz4-java"),
    libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
    libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.2.0",
    libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.2.0",
    libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.2.9",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5",
      libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test",
    libraryDependencies += "org.scalamock" %% "scalamock" % "4.1.0" % "test"
  )
