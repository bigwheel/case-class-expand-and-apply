name := "case-class-expand-and-apply"

version := "1.0.0"

scalaVersion := "2.12.7"

libraryDependencies ++= Seq(
  "com.chuusai" %% "shapeless" % "2.3.3",
  "org.scalactic" %% "scalactic" % "3.0.5",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
)

enablePlugins(spray.boilerplate.BoilerplatePlugin)
