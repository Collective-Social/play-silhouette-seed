// Comment to get more information during initialization
logLevel := Level.Warn

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.19")

// can be removed when Play release 2.8.20
ThisBuild / libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always


addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.3")
