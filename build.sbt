name := "akka-scraper"

version := "0.1"

scalaVersion := "2.12.8"

// https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.16"
// https://github.com/ruippeixotog/scala-scraper
libraryDependencies += "net.ruippeixotog" %% "scala-scraper" % "2.1.0"
// https://mvnrepository.com/artifact/com.typesafe.akka/akka-testkit
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.5.19" % Test