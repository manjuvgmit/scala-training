object FunctionPassingAsArgument { 
	
	def greet(printer:(String) => Unit) { // Unit is declared because we are not returning anything
		printer("Tring to print something here.")
	}
	
	def main(args:Array[String]) {
		greet(println) // Pass default println
		greet(a => println(a)) // Pass println in enclosed function
	}
	
}

// Output 
// Tring to print something here.
// Tring to print something here.