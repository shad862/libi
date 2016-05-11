lazy val akkaVersion = "2.4.4"

name := "com/iodum/libi"
version := "1.0"
scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion withSources() withJavadoc(),
  //"com.typesafe.akka" %% "akka-agent" % akkaVersion withSources() withJavadoc(),
  //"com.typesafe.akka" %% "akka-camel" % akkaVersion withSources() withJavadoc(),
  //"com.typesafe.akka" %% "akka-cluster" % akkaVersion withSources() withJavadoc(),
  //"com.typesafe.akka" %% "akka-cluster-metrics" % akkaVersion withSources() withJavadoc(),
  //"com.typesafe.akka" %% "akka-cluster-sharding" % akkaVersion withSources() withJavadoc(),
  //"com.typesafe.akka" %% "akka-cluster-tools" % akkaVersion withSources() withJavadoc(),
  //"com.typesafe.akka" %% "akka-contrib" % akkaVersion withSources() withJavadoc(),
  "com.typesafe.akka" %% "akka-http-core" % akkaVersion withSources() withJavadoc(),
  "com.typesafe.akka" %% "akka-http-testkit" % akkaVersion withSources() withJavadoc(),
  //"com.typesafe.akka" %% "akka-multi-node-testkit" % akkaVersion withSources() withJavadoc(),
  //"com.typesafe.akka" %% "akka-osgi" % akkaVersion withSources() withJavadoc(),
  //"com.typesafe.akka" %% "akka-persistence" % akkaVersion withSources() withJavadoc(),
  //"com.typesafe.akka" %% "akka-persistence-tck" % akkaVersion withSources() withJavadoc(),
  //"com.typesafe.akka" %% "akka-remote" % akkaVersion withSources() withJavadoc(),
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion withSources() withJavadoc(),
  "com.typesafe.akka" %% "akka-stream" % akkaVersion withSources() withJavadoc(),
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion withSources() withJavadoc(),
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion withSources() withJavadoc(),
  //"com.typesafe.akka" %% "akka-distributed-data-experimental" % akkaVersion withSources() withJavadoc(),
  //"com.typesafe.akka" %% "akka-typed-experimental" % akkaVersion withSources() withJavadoc(),
  "com.typesafe.akka" %% "akka-http-experimental" % akkaVersion withSources() withJavadoc(),
  "com.typesafe.akka" %% "akka-http-jackson-experimental" % akkaVersion withSources() withJavadoc(),
  "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaVersion withSources() withJavadoc(),
  "com.typesafe.akka" %% "akka-http-xml-experimental" % akkaVersion withSources() withJavadoc(),
  "com.typesafe.akka" %% "akka-persistence-query-experimental" % akkaVersion withSources() withJavadoc(),
  //"com.typesafe.akka" %% "akka-typed-experimental" % akkaVersion withSources() withJavadoc(),

  "org.slf4j" % "slf4j-api" % "1.7.21" withSources() withJavadoc(),
  "ch.qos.logback" % "logback-classic" % "1.1.7" withSources() withJavadoc()
)

mainClass in (Compile, run) := Some("com.iodum.libi.LastWordStubService")

