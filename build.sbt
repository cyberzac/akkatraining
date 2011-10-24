

name := "akka training"

scalaVersion := "2.9.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq("se.scalablesolutions.akka" % "akka-actor" % "1.2", "se.scalablesolutions.akka" % "akka-actor" % "1.2", "se.scalablesolutions.akka" % "akka-remote" % "1.2", "se.scalablesolutions.akka" % "akka-testkit" % "1.2", "se.scalablesolutions.akka" % "akka-stm" % "1.2", "org.scalatest" %% "scalatest" % "1.6.1" % "test", "junit" % "junit" % "4.5" % "test")
