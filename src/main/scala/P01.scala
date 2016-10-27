object P01 {
  def last[E](list: List[E]): E = list match {
    case last :: Nil => last
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }
}
