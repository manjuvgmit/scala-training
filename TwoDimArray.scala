object TwoDimArray {
	def main(args:Array[String]) {
		var values:Array[Array[String]] = new Array[Array[String]](2);
		
		values(0) = new Array[String](2);
		values(1) = new Array[String](2);
		
		values(0)(0) = "0, 0"
		values(0)(1) = "0, 1"
		values(1)(0) = "1, 0"
		values(1)(1) = "1, 1"
		
		println("---------------------------")
		println(values.length);
		println(values(0)(0));
		println(values(0)(1));
		println(values(1)(0));
		println(values(1)(1));
		
		println("---------------------------")
		for (i <- 0 until 2; j <- 0 until 2) {
			println("iterating.... : " + values(i)(j));
		}
		
		println("---------------------------")
		for (stepOne <- values; steptwo <- stepOne) {
			println("iterating.... : " + steptwo);
		}
		
		//------------------------ Simple Array from static function --------------------------------------
		var namesOne:Array[String] = Array.ofDim(2)
		//var names = Array.ofDim(2) // Does not work
		
		namesOne(0) = "0"
		namesOne(1) = "1"
		
		println("---------------------------")
		for (name <- namesOne) {
			println("iterating.... : " + name);
		}
		
		//------------------------ Two Dim Array from static function --------------------------------------
		var namesTwo:Array[Array[String]] = Array.ofDim(2,2)
		
		namesTwo(0)(0) = "0, 0"
		namesTwo(0)(1) = "0, 1"
		namesTwo(1)(0) = "1, 0"
		namesTwo(1)(1) = "1, 1"
		
		println("---------------------------")
		for (stepOne <- namesTwo; steptwo <- stepOne) {
			println("iterating.... : " + steptwo);
		}
		
		//------------------------ Three Dim Array from static function --------------------------------------
		var namesThree:Array[Array[Array[String]]] = Array.ofDim(2,2,2)
		
		namesThree(0)(0)(0) = "0, 0, 0"
		namesThree(0)(0)(1) = "0, 0, 1"
		namesThree(0)(1)(0) = "0, 1, 0"
		namesThree(0)(1)(1) = "0, 1, 1"
		namesThree(1)(0)(0) = "1, 0, 0"
		namesThree(1)(0)(1) = "1, 0, 1"
		namesThree(1)(1)(0) = "1, 1, 0"
		namesThree(1)(1)(1) = "1, 1, 1"
		
		println("---------------------------")
		for (stepOne <- namesThree; steptwo <- stepOne; stepthree <- steptwo) {
			println("iterating.... : " + stepthree);
		}
	}
}