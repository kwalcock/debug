name := "debug"

// Last checked 2022-04-10
val scala11 = "2.11.12" // up to 2.11.12
val scala12 = "2.12.15" // up to 2.12.15
val scala13 = "2.13.8"  // up to 2.13.8
val scala3  = "3.1.1"   // up to 3.1.1

ThisBuild / crossScalaVersions := Seq(scala12, scala11, scala13, scala3)
ThisBuild / scalaVersion := crossScalaVersions.value.last
