object ExcerciseOne { // scope of and resolution of functions
	
	var greet = (name:String) => println("Hi, " + name)
	
	def main(args:Array[String]) {
		var greet = (name:String) => println("Hello, " + name)
		greet("Modi")
	}
	
	greet("Trump")
}