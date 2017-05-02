def sum(a:Int, b:Int) :String = {
	
	def printSum(sum:Int) :String = {
		"Sum is : " + sum
	}
	
	def sayHi() {
		println("Hiiiiiii")
	}
	
	printSum(a + b)
}

println(sum(10, 20))

// sayHi  // error: not found: value sayHi