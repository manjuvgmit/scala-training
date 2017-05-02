import java.util.{Date,List}

object MatchFunctionDemo {
	def chooseColor(color:String="Nothing") :String = color match {
		case "RED" => "RED is dope"
		case "BLACK" => "Black is cool"
		case _ => "Nothing is cooler than anything"
	}
	
	def chooseAnything(param:Any) :Any = param match {
		case "RED" => "RED is dope"
		case "BLACK" => "Black is cool"
		case 12 => "Correct Price in integer"
		case 12.00 => "Correct Price in decimals"
		case param:Date => "Matched date" // Type match
		case _ => "Nothing is cooler than anything"
	}
	
	def main(args:Array[String]) {
		println(chooseColor("RED"))
		println(chooseColor("BLACK"))
		println(chooseColor("NOTHING"))
		println(chooseColor())
		
		println(chooseAnything("BLACK"))
		println(chooseAnything("RED"))
		println(chooseAnything(12))
		println(chooseAnything(12.00))
		println(chooseAnything(13))
		//import java.util.{Date,List}
		//import java.util._
		println(chooseAnything(new Date()))
		
	}
}