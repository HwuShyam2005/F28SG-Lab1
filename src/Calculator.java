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
		//CREATION OF A NEW STACK 'NAME' TO STORE RESULTS
		Stack name = new Stack(100);
		int result = 0;
		//REVERSING THE INPUTS
		Reverse.reverse(cmds);
		
		//PUSHING IT ONTO STACK IF THE ELEMENT IS A NUMBER
		for (int i =0; i < cmds.length; i++) {
			if(isNumber(cmds[i])) {
				name.push(convert(cmds[i]));
			//IF ELEMENT IS AN OPERATOR THEN IT APPLIES THE OPERATION ON THE TOP TWO ELEMENTS OF THE STACK
			}else {
				result = applyOp(name.pop().toString(), cmds[i], name.pop().toString());
			    name.push(result);
			}
			
		}
		
		
		return result; // VALUE AT THE TOP OF THE STACK
	}	

	//CONVERTING AN STRING TO INTEGER ALONG WITH HANDLING THE ERRORS
	public static int convert(String s) throws NumberFormatException{
		int myNum = 0;
		
		if (isNumber(s)) {
			myNum = Integer.parseInt(s);
		}
		
		return myNum; // DUMMY VALUE
	}

	public static boolean isNumber(String s){
		boolean myBool = false;
		try {
		//IF THE CONDITION TO PARSE THE STRING IS AN INTEGER
			if ( Integer.parseInt(s)* 0 == 0) 
				myBool = true;
		} catch (NumberFormatException e) {
		//INCASE IF IT FAILS, THEN IT ISNT A VALID NUMBER	
			myBool = false;
		}
		
		return myBool; // DUMMY VALUE
	}

	//APPLY THE OPERATOR AFTER CONVERTING THE NUMBERS
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
		
		return 0; // DUMMY VALUE
	}

	//MAIN OPERATION TO CALCULATE USING POLISH NOTATION DIRECTLY
    public static int calculatePolish(String [] cmds){
    	return -1; // DUMMY VALUE
    }
}