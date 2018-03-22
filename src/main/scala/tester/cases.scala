package cases

case class Veggies(name: String, family: String ) {
  def monthToSow = {if (family == "bras")   "april"  else   "may" }

  def upper(strings: String*): Seq[String] = {
    strings.map(_.toUpperCase())
  }

}
