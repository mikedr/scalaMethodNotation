object MethodNotations extends App {

  def miguel = new Person("Miguel", "The Godfather")
  println(miguel.likes("The Godfather"))
}

class Person(val name: String, favoriteMovie: String) {
  def likes(movie: String): Boolean = movie == favoriteMovie
}
