object MethodNotations extends App {

  val miguel = new Person("Miguel", "The Godfather")
  println(miguel likes "The Godfather") //infix notation - operator notation
  val gabriela = new Person("Gabriela", "Back to the future")
  println(miguel hangOutWith gabriela)
}

class Person(val name: String, favoriteMovie: String) {
  def likes(movie: String): Boolean = movie == favoriteMovie
  def hangOutWith(otherPerson: Person): String = s"$name hang outs with ${otherPerson.name}"
}
