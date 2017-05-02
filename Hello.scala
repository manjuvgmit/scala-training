object Hello {

	def main(str: Array[String]) {
		var i = 10
		val j = 20
		var k = true
		var m = "I am String"
		println("Hello")
		println(i)
		println(j)
		//j = 30
		println(j.getClass())
		println(k.getClass())
		println(m.getClass())
		// STatic type variable
		var a:Int = 25
		println(a)
		// Operator overloading
		println(i.+(j))
		// 
		greetNoon()
		greetEveOne()
		greetEveTwo()
		println(greetMorning)
		println(greetMorning())
		println(greetMorning().getClass())
		val name = "Manjunath"
		//greetEveTwo("Manjunath")
		greetEveTwo(name)
		greetEveTwo("Manjunath", "Davanagere")
		greetEveTwo(city="Davanagere", name="Manjunath")
		greetEveThree(city="Davanagere", name="Manjunath", state="Karnataka")
		greetEveThree(city="Davanagere", name="Manjunath")
		greetEveTwo()
	}
	
	def greetNoon() = println("Good Afternoon")
	
	def greetEveOne() = {
		println("Good Evening")
		println("--Manjunath")
	}
	
	//def greetEveTwo() {
	//	println("Good Evening")
	//	println("--Manjunath")
	//}
	
	def greetMorning():Any = {
		return "Good Morning"
	}
	
	def greetEveTwo(name:String="Manjunath") {
		println("Good Evening, " + name)
		//name = "Pintu"
	}
	
	def greetEveTwo(name:String, city:String) {
		println("Good Evening, " + name + ", from " + city)
	}
	
	def greetEveThree(name:String, city:String, state:String="Karnataka") {
		println("Good Evening, " + name + ", from " + city + ", " + state)
	}

}