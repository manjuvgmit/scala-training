----------------------------------------------
Match Expressions
----------------------------------------------
Similar to switch in java but
	* No need of break as one match will terminate successive cases execution. Also break is repeatation for each case statement. If we forget break then multiple cases will execute.
	* Case works only with numbers and strings in java but scala will support all types
	* match works as function so it can return values
		* has result = variable match {
			case xxx: "String to be returned"
			case yyy: "String to be returned"
		}

----------------------------------------------
* If and else can return value
----------------------------------------------
	var message:String = if (condition) 
		"Hi Dear"
	else
		"Hello Dear"
	
	println(message) // prints either one
----------------------------------------------		
* Return keyword is not mandatory
* Default values can be defined for method params
----------------------------------------------		
	def greet(name:String="Guest") {
		println("Hello ," + name);
	}
	greet() will print "Hello Guest"
----------------------------------------------		
* Dynamic language will not be strict type which let types to be inferred at the runtime
* Interpreter is choosen for lanugage which will not be converted and then executed instead they will be read and interpreted simultaneously
* Interpreter actually "Compiles + Executes" at the same time.
* Concurrent app should have minimal shared objects. and shared objects should be immutable.
* When declaring arguments, var/val is mandatory.
	* def greet(0
----------------------------------------------		
*                         		Any
					AnyVal	-----				----	AnyRef
int - long - double - char - boolean		--- All custom classes and java classes
----------------------------------------------				
* Scala has only class or abstract class and no interface concept
* Traits are replacements for interface
	* traits are not interface or class
	* interface are only for communication and not part of OOPS
	* No implements keyword because no interface in scala
* var properties of super class cannot be overriden, only val properties can be. ###########
* constructors are functions and values can be passed by name like functions
* Access Specifiers
	* private : class will not able accessible anywhere
	* protected : accisible only if inherited either inside package or outside
	* no-modifier : by default public : for both class and functions
* Every function is an object in scala #####
* Scala has a class Function.java which will be class for all fucntions in scala
* Scala can be Object oriented, Functional or Scripting language
* Main method also can have inner functions similar to other functions
* Anonymous Functions
	* Function defintion will have four part, definition, name, arguments and body
		def greet() {
			println("Good Morning.")
		}
	* Remove name and definitions
		() => {
			println("Good Morning.")
		}
	* Closure in nothing but lambda in java which is anonymous functions
	* => is called <<<<<<<FAT arrow function>>>>>>>> in javascript
	* -> java uses <<<<<<<<<Lean arrow>>>>>>>>>
	* scala > :type a
		() => Unit
* By default var will have "Nothing" in scala, so it handles NPEs
* Default return type is "Unit" in scala. if there any return types then it iwll override "Unit" type
* When we print a method returning nothing which is actually "Unit" then it prints "()"
	* println(main()) // Main returning nothing
* Function is not under "Any" hierarchy. Function is not Any type
----------------------------------------------
Misc
----------------------------------------------
* No need of installing anyting for scala. just download plugins wihch does come with scala libraries. JDK is enough for running scala.
* java supports only multi-level and hierarchy inheritance. and does not support multiple and hybrid inheritance
* Interface Issues
	* Interface forces for impl of methods. which is dulicate of code
	* Two interface methods have same method and class is overriding then which method will get overriden? or error? Ans: No error
* Mixin : is alternative to support multiple inheritence. Scala supports multiple inheritence through Mixin
	* Mixing is not inheritance , it is actually code copied or mixed to class. so we cannot call super in case of Mixin and instead all be a part of your class
* Byte-code instrumentation
* java 8 default methods in interface are called DEFEENDER methods
* Closure in nothing but lambda in java which is anonymous functions
----------------------------------------------
Scala Topics
----------------------------------------------
closures
Anonymous functions
Higher order functions
yield keyword #####