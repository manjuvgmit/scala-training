def greet(user:String):Any = {

	def greetGoodMorning(user:String) = (s:String) => {
		"Good Morning, " + user
	}
	
	greetGoodMorning(user)
}

println(greet("Manjunath"))

// Output
// Main$$anon$1$$Lambda$119/68377659@4d5d943d