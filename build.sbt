name := "Effective-Lift"

version := "0.0.1"

organization := "net.liftweb"

scalaVersion := "2.10.0"

resolvers ++= Seq("snapshots"     at "http://oss.sonatype.org/content/repositories/snapshots",
                "releases"        at "http://oss.sonatype.org/content/repositories/releases"
                )

seq(com.github.siasia.WebPlugin.webSettings :_*)

unmanagedResourceDirectories in Test <+= (baseDirectory) { _ / "src/main/webapp" }

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  val liftVersion = "2.5-RC2"
  Seq(
    "net.liftweb"       %% "lift-webkit"        % liftVersion        % "compile",
     "net.liftmodules" % "lift-jquery-module_2.10" % (liftVersion + "-2.2"),
    "org.eclipse.jetty" % "jetty-webapp" % "8.1.10.v20130312" % "container",
    "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container,test" artifacts Artifact("javax.servlet", "jar", "jar"),
    "ch.qos.logback"    % "logback-classic"     % "1.0.6",
    "org.specs2" % "specs2_2.10" % "1.14" % "test"
  )
}

