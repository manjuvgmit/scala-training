var greetUser = (user:String) => { // cannot assign default values to args in anonymous functions : error Multiple Marker found
	println("Good Morining.., " + user + ".")
}

var greetGuest = () => {
	println("Good Morining.., Guest.")
}

var greetGuestTwo = () => println("Good Morining.., People.")

var greetGuestThree = () => "Good Morining.., Object."

object SomeClass {
	def main(args:Array[String]) { // Never executes unless enclosed in class
		var greetGuestTwo = () => println("Good Morining.., Main People.")
		greetGuestTwo()
		println(greetGuestTwo)  
	}
}
//greetGuest 
//C:\Users\User\scala-work\AnonymousFunctionDemo.scala:9: warning: a pure expression does nothing in statement position; multiline expressions may require enclosing paren
//theses
//greetGuest
//^
//one warning found

greetGuest() 

greetGuest.apply // Works if not passing args

greetUser("Manjunath")

greetUser.apply("Manjunath")

greetGuestTwo() 

println(greetGuestThree())

println(greetGuest) 
println(greetUser)  
println(greetGuestTwo)  

// Output
//Good Morining.., Guest.
//Good Morining.., Guest.
//Good Morining.., Manjunath.
//Good Morining.., Manjunath.
//Good Morining.., People.
//Good Morining.., Object.
//Main$$anon$1$$Lambda$116/1627857534@1aafa419
//Main$$anon$1$$Lambda$115/1043351526@47eaca72
//Main$$anon$1$$Lambda$117/2084663827@55141def

// Warning
// C:\Users\User\scala-work\AnonymousFunctionDemo.scala:9: warning: Script has a main object but statement is disallowed
// var greetUser = (user:String) => { // cannot assign default values to args in anonymous functions : error Multiple Marker found
// ^