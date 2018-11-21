name := "case-class-expand-and-apply"
organization := "com.github.bigwheel"
version := "1.0.0"
scalaVersion := "2.12.7"

libraryDependencies ++= Seq(
  "com.chuusai" %% "shapeless" % "2.3.3",
  "org.scalactic" %% "scalactic" % "3.0.5",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
)

enablePlugins(spray.boilerplate.BoilerplatePlugin)

// about maven publish
publishMavenStyle := true
publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}
publishArtifact in Test := false
licenses := Seq("BSD-3-Clause" -> url("https://github.com/bigwheel/case-class-expand-and-apply/blob/master/LICENSE"))
homepage := Some(url("https://github.com/bigwheel/case-class-expand-and-apply"))
pomExtra := (
  <scm>
    <url>git@github.com:bigwheel/case-class-expand-and-apply.git</url>
    <connection>scm:git:git@github.com:bigwheel/case-class-expand-and-apply.git</connection>
  </scm>
    <developers>
      <developer>
        <id>bigwheel</id>
        <name>k.bigwheel</name>
        <url>https://github.com/bigwheel</url>
      </developer>
    </developers>
  )