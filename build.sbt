name := "Simple Application"

version := "0.1"

organization := "Knoldus"

scalaVersion := "2.10.0"

resolvers ++= Seq("snapshots"     at "http://oss.sonatype.org/content/repositories/snapshots",
                "releases"        at "http://oss.sonatype.org/content/repositories/releases"
                )

libraryDependencies ++= {
  val liftVersion = "2.5-RC2"
  Seq(
    "net.liftmodules" % "widgets_2.10" % (liftVersion+"-1.2") % "compile->default",
    "org.eclipse.jetty" % "jetty-webapp" % "8.1.10.v20130312" % "container",
    "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container,test" artifacts Artifact("javax.servlet", "jar", "jar")
  )
}


scalacOptions += "-deprecation"

seq(webSettings :_*)

