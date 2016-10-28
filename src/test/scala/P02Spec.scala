import org.scalatest._

class P02Spec extends FlatSpec with DiagrammedAssertions {
  "penultimate" should "最後から2番めの要素を取ってくることができる" in {
    assert(P02.penultimate(List(6, 5, 4, 3)) === 4)
    assert(P02.penultimate(List(3, 2, 1)) === 2)
  }

  it should "要素が1つ以下である場合は例外を投げる" in {
    intercept[NoSuchElementException] {
      P02.penultimate(List())
    }

    intercept[NoSuchElementException] {
      P02.penultimate(List(1))
    }
  }
}
