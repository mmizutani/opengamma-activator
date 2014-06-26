name := """opengamma-activator"""

version := "1.0"

// This forbids including Scala related libraries into the dependency
autoScalaLibrary := false

// sbt can search your local Maven repository if you add it as a repository:
resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"

libraryDependencies ++= Seq(
   "com.opengamma.platform" % "og-util" % "2.2.0-SNAPSHOT",
   "com.opengamma.platform" % "og-analytics" % "2.2.0-SNAPSHOT",
   "com.opengamma.platform" % "og-timeseries" % "2.2.0-SNAPSHOT"
)
