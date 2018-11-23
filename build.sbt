name := "case-class-expand-and-apply"
organization := "com.github.bigwheel"
version := "1.0.2"
scalaVersion := "2.12.7"

crossScalaVersions := Seq("2.12.7", "2.13.0-M5")

libraryDependencies ++= Seq(
  "com.chuusai" %% "shapeless" % "2.3.3",
  "org.scalactic" %% "scalactic" % "3.0.+",
  "org.scalatest" %% "scalatest" % "3.0.+" % "test",
)

enablePlugins(spray.boilerplate.BoilerplatePlugin)

// about maven publish
publishMavenStyle := true
publishTo := sonatypePublishTo.value
publishArtifact in Test := false

import xerial.sbt.Sonatype._
sonatypeProjectHosting := Some(GitHubHosting("bigwheel", name.value, "k.bigwheel", "k.bigwheel+eng@gmail.com"))
licenses := Seq("MIT license" -> url(homepage.value.get.toString + "/blob/master/LICENSE"))
