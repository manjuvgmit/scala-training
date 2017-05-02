object HybridInheritenceDemoContd {
	
	def main(args:Array[String]) {
		
		println("-----------------------------------")
		var furnitureOne = new Furniture()
		furnitureOne.display
		
		println("-----------------------------------")
		var furnitureTwo = new Furniture(2)
		furnitureTwo.display
		
		println("-----------------------------------")
		var furnitureThree = new Furniture(3, "Jeek")
		furnitureThree.display
		
		println("-----------------------------------")
		var furnitureFour = new Furniture(4, "Some", 450.00)
		furnitureFour.display
		
		// Output
		//-----------------------------------
		//Furniture[id:1, material:Teak, price:250.0]
		//-----------------------------------
		//Furniture[id:2, material:Teak, price:250.0]
		//-----------------------------------
		//Furniture[id:3, material:Jeek, price:250.0]
		//-----------------------------------
		//Furniture[id:4, material:Some, price:450.0]
		
	}
	
}

class Furniture(var id:Int=1, var material:String="Teak", var price:Double=250.00) {
	
	def display() {
		printf("Furniture[id:%s, material:%s, price:%s]", id, material, price)
		println()
	}
	
}