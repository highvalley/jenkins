name := "jenkins"

scalaVersion := "2.10.0"

seq(ScctPlugin.instrumentSettings : _*)

seq(org.scalastyle.sbt.ScalastylePlugin.Settings : _*)

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.13" % "test"
)
