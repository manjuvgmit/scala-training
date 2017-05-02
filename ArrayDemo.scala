object ArrayDemo {
	def main(args:Array[String]) {
		//var names:Array[String] = new Array[String](5);
		var names = new Array[String](5);
		
		names(0) = "Manju"
		names(1) = "Manjunath"
		names(2) = "Manjunath Veeranna"
		
		println(names.size)
		println(names.length)
		println(names(2))
		
		println("---------------------------")
		
		for (index <- 0 to 2) {
			println(names(index))
		}
		
		println("---------------------------")
		//
		for (name <- names) {
			printf("Going over.. %s", name)
			println
		}
		
		println("---------------------------")
		//Netsted Loops
		for (index <- 0 to 2; countdown <- 0 to 5) {
			printf("Going over.. %s.. Countdown is .. %s", names(index), countdown)
			println
		}
		
		println("---------------------------")
		//Loops with filters: only even memeber iterated
		for (index <- 0 to 2; if(index % 2 == 0)) {
			printf("Going over.. %s.. ", names(index))
			println
		}
		
		println("---------------------------")
		//Loops with filters: only even memeber iterated
		for (index <- 0 to 100; if(index % 2 == 0); if(index % 10 == 0)) {
			printf("Counting.. %s.. ", index)
			println
		}
		
		println("---------------------------")
		//Loops with filters: only even memeber iterated
		for (index <- 0 to 100; square = index * index; if(square < 1000)) {
			printf("Counting.. %s.. square.. %s", index, square)
			println
		}
		
	}
}