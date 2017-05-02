object HybridInheritenceDemo {
	def main(args:Array[String]) {
		var multipleAccount = new MultipleAccount()
		//println(multipleAccount.balance)  // Prints empty "()" at the end
		multipleAccount.balance
	}
}

trait Account {
	def balance()
}

trait SavingAccount extends Account {
	override def balance() { // If there no override then it will be a new method
		println("SavingAccount balance")
	}
}

trait CurrentAccount extends Account {
	override def balance() {
		println("CurrentAccount balance")
	}
}

// In case of ambuiguity last trait on right side will be resolved
class MultipleAccount extends SavingAccount with CurrentAccount { // CurrentAccount resolved
//class MultipleAccount extends CurrentAccount with SavingAccount{ // SavingAccount resolved
	// 1. 
	// 2. 
}