packSettings

packMain := Map("license_plate_reader" -> "license_plate_reader")

name := "LicensePlateReader"

version := "0.2"

organization := "edu.umass.cs"

scalaVersion := Common.ScalaVersion

exportJars := true

libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.7.5" exclude("org.apache.httpcomponents", "httpclient")

libraryDependencies += "commons-io" % "commons-io" % "2.4"

libraryDependencies += "org.imgscalr" % "imgscalr-lib" % "4.2"

libraryDependencies += "net.ettinsmoor" % "bingerator_2.10" % "0.2.2"