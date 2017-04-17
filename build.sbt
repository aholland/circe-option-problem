name := "circe-option-problem"

version := "1.0"

scalaVersion := "2.12.1"

val circeDeps = Seq(
 "io.circe" %% "circe-core" % "0.7.1",
 "io.circe" %% "circe-generic" % "0.7.1",
 "io.circe" %% "circe-parser" % "0.7.1"
)

libraryDependencies ++= circeDeps