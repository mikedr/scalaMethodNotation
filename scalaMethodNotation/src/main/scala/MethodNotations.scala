import scala.language.postfixOps

object MethodNotations extends App {

  val miguel = new Person("Miguel", "The Godfather")
  println(miguel likes "The Godfather") //infix notation - operator notation
  val gabriela = new Person("Gabriela", "Back to the future")

  println(!miguel) //tipo de invoación 1
  println(gabriela.unary_!) //tipo de invoación 2

  println(miguel isAlive)

  println(gabriela.apply()) //Forma 1 de llamar a apply, la común
  println(gabriela()) //Forma 2 de llamar a apply. Mágica

  println(miguel + "El asador")
  println(miguel + gabriela)

  def nuevaPersona = new Person("Bruce", "Batman",50)
  println(+nuevaPersona)

  println(nuevaPersona.learns("Kung fu"))
  println(nuevaPersona learns)

  println(miguel.apply(1000))
}

class Person(val name: String, favoriteMovie: String, val age: Int = 0) {

  def likes(movie: String): Boolean = movie == favoriteMovie
  def +(otherPerson: Person): String = s"$name hang outs with ${otherPerson.name}"
  def +(nickname: String): Person = new Person(s"$name ($nickname)",favoriteMovie)
  def unary_! : String = s"$name unary operator!"
  def isAlive: Boolean = true
  def apply(): String = s"Soy $name y mi pelicula favorita es $favoriteMovie"

  override def toString = s"$name ($age años)"
  def unary_+(): Person = new Person(name, favoriteMovie, age+1)

  def learns(skill: String): String = s"$name learns $skill"
  def learns(): String = this.learns("scala")

  def apply(times: Int): String = s"$name watched $favoriteMovie $times times"
}
