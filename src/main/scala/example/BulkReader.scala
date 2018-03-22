package example

class BulkReader(val source: String) {
  type In = String
  def read: String = source

  def isEven(n: Int) = (n % 2) == 0
}
