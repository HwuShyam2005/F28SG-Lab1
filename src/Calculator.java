// exception used for Q5
class CalculateException extends RuntimeException{    
	public CalculateException(String err) {
		super(err);
	}
}

public class Calculator {

	/*
	 *  Methods for Part 3
	 */
	public static int calculate(String [] cmds){
		Stack pstack = new Stack(100);
		return 0; // dummy value
	}	

	public static int convert(String s) throws NumberFormatException{
		return 0; // dummy value
	}

	public static boolean isNumber(String s){
		return true; // dummy value
	}

	// apply the operator after converting the numbers
	public static int applyOp(String fst,String op,String snd){
		return -1; // dummy value
	}

	// main operation to calculate using Polish notation directly
    public static int calculatePolish(String [] cmds){
    	return -1; // dummy value
    }
}
