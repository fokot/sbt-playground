val scala3Version = "3.4.2"

ThisBuild /  scalaVersion := scala3Version
ThisBuild /  libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test

lazy val root = project
  .in(file("."))
  .settings(
    name := "sbt-playground",
    version := "0.1.0-SNAPSHOT",
  ).dependsOn(dependent1, dependent2)

lazy val shared1 = project.in(file("shared_1"))
lazy val dependent1 = project.in(file("dependent_1")).dependsOn(shared1)
lazy val shared2 = project.in(file("shared_2"))
lazy val dependent2 = project.in(file("dependent_2")).dependsOn(shared2)