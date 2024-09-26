import org.scalatest.wordspec.AnyWordSpec

final class MultilineTest extends AnyWordSpec{
  "multiline error" in {
    fail(
      """
        |this is
        |a multiline
        |error message
        |""".stripMargin)
  }
  "singleline erroo" in {
    fail("this is a singleline error message")
  }
}
