object FinalsDemo {
	
	def main(args:Array[String]) {
		
		var manager = new Manager();
		
	}
	
}

class Employee {
	var name:String = "Manjunath"
	private var salary:Double = 250.00
	
	final def display() {
		printf("Employee[name: %s, Salary:%s]", name, salary)
		println()
	}
	
}

class Manager extends Employee {
	
	def approve() {
		println("Approved.")
	}
	
	//def display() { // error: overriding method display in class Employee of type ()Unit;
		//printf("Manager[name: %s]", name)
		//println()
	//}
	
}