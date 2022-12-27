object MethodNotations extends App {

  def miguel = new Person("Miguel", "The Godfather")
  println(miguel likes "The Godfather") //infix notation - operator notation
}

class Person(val name: String, favoriteMovie: String) {
  def likes(movie: String): Boolean = movie == favoriteMovie
  def hangOutWith(otherPerson: String): String = s"$name hang outs with $otherPerson"
}
