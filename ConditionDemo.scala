object ConditionDemo {

	def main(string:Array[String]) {
		var age:Int = 24;
		
		if (age >= 20) {
			println("Too young for the movie.")
		} else {
			println("Enjoy the movie with popcorn")
		}
		
		println("");
		
		var message:String = 
		if (age >= 20)
			"Too young for the movie."
		else
			"Enjoy the movie with popcorn"
		
		println(message);
	}

}