object CarDemoContd {
	
	def main(args:Array[String]) {
		
		println("----------------------------------")
		var car = new Car("Generic");
		car.display
		car.exhaustSound
		println("----------------------------------")
		var audiCarOne = new Audi(true);
		audiCarOne.display
		audiCarOne.exhaustSound
		println("----------------------------------")
		var audiCarTwo = new Audi();
		audiCarTwo.display
		audiCarTwo.exhaustSound
		println("----------------------------------")
		var porcheCar = new Porche(true);
		porcheCar.display
		porcheCar.exhaustSound
		println("----------------------------------")
		
	}
	
}

// Not overriding instead initializing the super class member here
class Audi(name:String, var isSportCar:Boolean) extends Car("Audi"){ 

	//override var speed:Int = 550 // Gives error as it tries to create new variable with same name as supe class one
	this.speed = 450
	
	def this(isSportCar:Boolean) {
		this("Audi", isSportCar)
	}
	
	def this() {
		this(true)
	}
	
	override def exhaustSound() {
		println("Audi exhaust sound....")
	}
}

// Not overriding instead initializing the super class member here
class Porche(name:String, var isSportCar:Boolean) extends Car(name){ 

	//override var speed:Int = 550 // Gives error as it tries to create new variable with same name as supe class one
	this.speed = 550
	
	def this(isSportCar:Boolean) {
		this("Porche", isSportCar)
	}
	
	def this() {
		this(true)
	}
	
	override def exhaustSound() {
		println("Porche exhaust sound....")
	}
}

class Car(var name:String, var isFourWheenDrive:Boolean=false) {

	var speed:Int = 50
	
	def display() {
		printf("Car['name': %s, 'speed': %s, 'isFourWheenDrive': %s]", name, speed, isFourWheenDrive)
		println
	}
	
	def exhaustSound() {
		println("Normal....")
	}
}