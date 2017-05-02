////////// x 2.0
object PersonDemo {
	def main(args:Array[String]) {
		var personOne = new Person();
		personOne.display
	}
}

// No arg parameter
//class Person() {
// Gives error as class contructor and explicit member definitin has members name at same scope i.e. class scope
//class Person(id:Int, name:String, age:Int) {
class Person(id:Int, name:String, age:Int) {

	// Java like memeber definition
	var id:Int = 0;
	var name:String = "Guest"
	var age:Int = 0;
	
	def display() {
		printf("person['id':%d, 'name':'%s', 'age':%d]", id, name, age);
	}
}