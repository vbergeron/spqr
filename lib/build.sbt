scalaVersion := "3.3.0"

enablePlugins(ScalaNativePlugin)

name := "spqr"

// set to Debug for compilation details (Info is default)
logLevel := Level.Info

// import to add Scala Native options
import scala.scalanative.build._

// defaults set with common options shown
nativeConfig ~= { c =>
  c.withLTO(LTO.thin)
    .withMode(Mode.debug)
    .withGC(GC.none)
    .withBuildTarget(BuildTarget.libraryDynamic)

}
