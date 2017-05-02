object HybridInheritenceDemoContd {
	def main(args:Array[String]) {
		println("-----------------------------------")
		var savingAcc = new SavingAccount()
		//println(savingAcc.balance)  // Prints empty "()" at the end
		savingAcc.balance
		
		println("-----------------------------------")
		var currentAcc = new CurrentAccount()
		//println(currentAcc.balance)  // Prints empty "()" at the end
		currentAcc.balance
		
		
		println("-----------------------------------")
		
	}
}

class Account {
	//var balance:Double = 40000.00 // Var cannot be overriden on super class
	val balanceValue:Double = 40000.00
	def balance() {
		println("Account Balance : " + balanceValue)
	}
}

class SavingAccount extends Account {
	override val balanceValue:Double = 50000.00
	override def balance() { // If there no override then it will be a new method
		println("SavingAccount Balance : " + balanceValue)
	}
}

class CurrentAccount extends Account {
	override val balanceValue:Double = 60000.00
	override def balance() {
		println("CurrentAccount Balance : " + balanceValue)
	}
}

// In case of ambuiguity last trait on right side will be resolved
class MultipleAccount extends SavingAccount { // CurrentAccount resolved
//class MultipleAccount extends CurrentAccount with SavingAccount{ // SavingAccount resolved
		
	// Output
	// SavingAccount Balance : 50000.0
	// CurrentAccount Balance : 60000.0
}