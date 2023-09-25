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
		int result = 0;
		Reverse.reverse(cmds);
		
		for (int i =0; i < cmds.length; i++) {
			if(isNumber(cmds[i])) {
				pstack.push(convert(cmds[i]));
			}else {
				result = applyOp(pstack.pop().toString(), cmds[i], pstack.pop().toString());
			    pstack.push(result);
			}
			
		}
		
		
		return result; // dummy value
	}	

	public static int convert(String s) throws NumberFormatException{
		int myNum = 0;
		
		if (isNumber(s)) {
			myNum = Integer.parseInt(s);
		}
		
		return myNum; // dummy value
	}

	public static boolean isNumber(String s){
		boolean myBool = false;
		try {
			if ( Integer.parseInt(s)* 0 == 0) 
				myBool = true;
		} catch (NumberFormatException e) {
			myBool = false;
		}
		
		return myBool; // dummy value
	}

	// apply the operator after converting the numbers
	public static int applyOp(String fst,String op,String snd){
		
		int j1 = convert(fst);
		int j2 = convert(snd);
		if (op.equals("+")) {
			return j1 + j2;
		}
		if (op.equals("-")) {
			return j1 - j2;
		}
		if (op.equals("*")) {
			return j1 * j2;
		}
		if (op.equals("/")) {
			return j1 / j2;
		}
		
		return 0; // dummy value
	}

	// main operation to calculate using Polish notation directly
    public static int calculatePolish(String [] cmds){
    	return -1; // dummy value
    }
}