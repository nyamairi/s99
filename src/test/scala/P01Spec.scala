import org.scalatest._

class P01Spec extends FlatSpec with DiagrammedAssertions {
  "last" should "最後の要素を取ってくることができる" in {
    assert(P01.last(List(3, 2, 1)) === 1)
    assert(P01.last(List(2)) === 2)
  }

  it should "要素がない場合は例外を投げる" in {
    intercept[NoSuchElementException] {
      P01.last(List())
    }
  }
}
