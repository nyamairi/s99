object P02 {
  def penultimate[E](list: List[E]): E = list match {
    case e :: l :: Nil => e
    case e :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }
}
