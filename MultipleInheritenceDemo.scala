// can we extend a class and mixin an trait ?
// "class ClassOne extends ClassTwo with TrainOne" ?
object MultipleInheritenceDemo {
	
	def main(args:Array[String]) {
		println("----------------------------------")
		//var autoMobile = new Vehicle()
		var autoMobile = new Car()
		autoMobile.run
		autoMobile.fly
		autoMobile.stop
		autoMobile.accelerate
		autoMobile.break
		autoMobile.details
		
		println("----------------------------------")
		println(new AutoMobile()) //error: trait AutoMobile is abstract; cannot be instantiated
		println("----------------------------------")
	}
	
}

// Only extends can be applied for one class
//class vehicle extends AutoMobile, Flying {
class Car extends Vehicle with AutoMobile with Flying with Acceleratable with Breakable {
	override var milage:Int = 750 //Can override because not initilized
	
	override def run() {
		println("Running")
	}
	
	override def fly() {
		println("Flying")
	}
	
	override def details() {
		println("Details")
	}
}

abstract class Vehicle {
	def details()
}

// Does not support multiple inheritance from class
//class AutoMobile {
//trait AutoMobile(var name:String) { // error: traits or objects may not have parameters
trait AutoMobile {
	var speed:Int = 500
	//var milage:Int = 80 // Cannot override if initilized
	var milage:Int 
	
	def run()
	
	def stop() {
		println("stopping Run")
	}
}

//class Flying {
trait Flying {
	def fly()
}

trait Acceleratable {
	def accelerate() {
		println("Accelerate")
	}
}

trait Breakable {
	def break() {
		println("Break")
	}
}