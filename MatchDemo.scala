object MatchDemo {
	def main(args:Array[String]) {
		var color:String = "Blue"
		
		color match {
			case "Black" => println("Black is cool")
			case "Blue" => println("Blue is nice")
			case "Red" => println("Red is dope")
		}
		
		//color = "Red"
		color = "sdgdsg"
		
		var result = color match {
			case "Black" => println("Black is cool")
			case "Blue" => println("Blue is nice")
			case "Red" => println("Red is dope")
			case _ => println("Nothing is cooler than anything.")
		}
	}
	
}