object AbstractionDemo {
	
	def main(args:Array[String]) {
		
		println("---------------------------------")
		var employeeOne = new Employee();
		employeeOne.display
		println("---------------------------------")
		println(employeeOne.name)
		//println(employeeOne.salary) // error: variable salary in class Employee cannot be accessed in Employee
		println("---------------------------------")
		
		// output
		//---------------------------------
		//Employee[name: Manjunath, Salary:250.0]
		//---------------------------------
		//Manjunath
		//---------------------------------
	}
	
}

class Employee {
	var name:String = "Manjunath"
	private var salary:Double = 250.00
	
	def display() {
		printf("Employee[name: %s, Salary:%s]", name, salary)
		println()
	}
}