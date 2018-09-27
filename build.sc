import mill._, scalalib._, scalafmt._

trait Common extends ScalaModule with ScalafmtModule {
  def scalaVersion = "2.12.6"
}

// From Chapter 34
object firstswing extends Common {
  def ivyDeps = Agg(
    ivy"org.scala-lang.modules::scala-swing:2.0.3",
  )

  object test extends Tests {
    def ivyDeps = Agg(
      ivy"org.scalatest::scalatest:3.0.5",
    )
    def testFrameworks = Seq("org.scalatest.tools.Framework")
  }
}
