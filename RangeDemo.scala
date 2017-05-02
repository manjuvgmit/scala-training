object RangeDemo {
	def main(args:Array[String]) {
		
		println("----------- Anonymous Range ----------------")
		for (number <- 10 until 20) {
			println("iterating.... : " + number);
		}
		
		println("----------- Range 10 to 20 ----------------")
		var inclusive:Range = Range.inclusive(10, 20)
		println(inclusive)
		for (number <- inclusive) {
			println("iterating.... : " + number);
		}
		
		println("----------- NumericRange 10 to 50 by 5 ----------------")
		var inclusiveLong = Range.Long.inclusive(10,50,5)
		println(inclusiveLong)
		for (number <- inclusiveLong) {
			println("iterating.... : " + number);
		}
	}
}