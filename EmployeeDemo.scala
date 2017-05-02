//class Employee
//class Employee() // Either define class or constructor for defining a class
//class Employee(val id:Int)
class Employee(var id:Int, var name:String) { 
// Primary contructor  // or varibales declared in class definition become member variable and accssible all over

	// If not initialized then compiler forces to make abstract as it will treat it as unimplemented abstract method
	var age:Int = 0;
	// Gives error as other contructors are trying to override/reassign the value
	//val age:Int = 0;
	//var age:Int;

	// auxillary/secondary contructor
	def this(){ 
		this(0, "Guest")
		this.age = 25
	}
	
	// auxillary/secondary contructor, // Do not use var or val which would mean creating new field and will become duplicate so will not allow
	//def this(var id:Int){ 
	def this(id:Int){ 
		this(id, "Guest")
		this.age = 25
	}
	
	def display() {
		printf("Employee['id': %s, 'name'=%s]", id, name);
	}
}

object EmployeeDemo {
	def main(args:Array[String]) {
		
		var empOne = new Employee
		println(empOne)
		println(empOne.isInstanceOf[Employee])
		println(empOne.getClass())
		println(empOne.id)
		
		println("---------------------------")
		var empTwo = new Employee(1)
		empTwo.id = 5000
		println(empTwo.id)
		
		println("---------------------------")
		var empThree = new Employee(1, "Manjunath")
		println(empTwo.id)
		println(empTwo.name)
		
		println("---------------------------")
		println(empTwo.display)
		
	}

}