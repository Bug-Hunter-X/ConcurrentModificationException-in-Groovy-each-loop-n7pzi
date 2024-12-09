def someMethod() {
  def list = [1, 2, 3]
  def iterator = list.iterator()
  while (iterator.hasNext()) {
    def it = iterator.next()
    println it
    if (it == 2) {
      iterator.remove()
    }
  }
}
someMethod()